// Person superclass
class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;

    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}

// Customer subclass
class Customer extends Person {
    private int customerId;

    public Customer(String name, String address, String phoneNumber, int customerId) {
        super(name, address, phoneNumber);
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }
}

// Employee subclass
class Employee extends Person {
    private int employeeId;
    private String position;

    public Employee(String name, String address, String phoneNumber, int employeeId, String position) {
        super(name, address, phoneNumber);
        this.employeeId = employeeId;
        this.position = position;
    }

    public void checkIn(Room room, Customer customer) {
        if (room.isAvailable()) {
            room.setCustomer(customer);
            room.setAvailable(false);
            System.out.println("Customer " + customer.name + " has been checked into Room " + room.getRoomNumber());
        } else {
            System.out.println("Room " + room.getRoomNumber() + " is not available.");
        }
    }

    public void checkOut(Room room) {
        room.setCustomer(null);
        room.setAvailable(true);
        System.out.println("Room " + room.getRoomNumber() + " has been checked out.");
    }
}

// Room class
class Room {
    private int roomNumber;
    private String roomType;
    private boolean isAvailable;
    private Customer customer;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getRoomType() {
        return roomType;
    }
}

// Booking class
class Booking {
    private int bookingId;
    private Customer customer;
    private Room room;
    private String date;

    public Booking(int bookingId, Customer customer, Room room, String date) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.room = room;
        this.date = date;
    }

    public void confirmBooking() {
        if (room.isAvailable()) {
            room.setAvailable(false);
            room.setCustomer(customer);
            System.out.println("Booking Confirmed: Room " + room.getRoomNumber() + " for Customer " + customer.name + " on " + date);
        } else {
            System.out.println("Booking Failed: Room " + room.getRoomNumber() + " is not available.");
        }
    }
}

// Payment class
class Payment {
    private int paymentId;
    private double amount;
    private String paymentMethod;

    public Payment(int paymentId, double amount, String paymentMethod) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void makePayment() {
        System.out.println("Payment of " + amount + " using " + paymentMethod + " is successful.");
    }
}

// Main class to test the system
public class HotelManagementSystem {
    public static void main(String[] args) {
        // Create customer and employee
        Customer customer1 = new Customer("Nafisa", "Dhanmondi", "018XXXXXXXX", 101);
        Employee employee1 = new Employee("Mr. Rahim", "Banani", "017XXXXXXXX", 201, "Receptionist");

        // Create room
        Room room1 = new Room(301, "Deluxe");

        // Booking
        Booking booking1 = new Booking(501, customer1, room1, "2025-06-01");
        booking1.confirmBooking();

        // Payment
        Payment payment1 = new Payment(601, 4500.00, "Credit Card");
        payment1.makePayment();

        // Check-in
        employee1.checkIn(room1, customer1);

        // Check-out
        employee1.checkOut(room1);
    }
}
