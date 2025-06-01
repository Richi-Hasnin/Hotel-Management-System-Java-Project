# 🏨 Hotel Management System - Java OOP Project

This is a basic Object-Oriented Java application that simulates a hotel management system. It demonstrates how inheritance, encapsulation, and object collaboration can be used to handle bookings, check-ins, check-outs, and payments.

## 📌 Features

- Customer and employee management
- Room availability tracking
- Booking confirmation
- Payment processing
- Employee-facilitated check-in/check-out

## 🧱 Class Overview

### 1. `Person` (Superclass)
- Base class for `Customer` and `Employee`
- Common attributes: name, address, phone number

### 2. `Customer` (Extends `Person`)
- Has a `customerId`
- Used for booking and room association

### 3. `Employee` (Extends `Person`)
- Has an `employeeId` and position
- Can check customers in and out of rooms

### 4. `Room`
- Tracks room number, type, availability, and assigned customer

### 5. `Booking`
- Represents a customer's room booking
- Confirms booking based on room availability

### 6. `Payment`
- Handles payment amount, method, and confirmation logic

### 7. `HotelManagementSystem` (Main class)
- Simulates the system by creating instances and running a full cycle of booking → payment → check-in → check-out

## 🚀 How to Run

### ✅ Requirements
- Java JDK 8 or higher
- IDE (IntelliJ, Eclipse) or CLI to compile and run

### ▶️ Steps

1. Copy all the code into a file named `HotelManagementSystem.java`.
2. Open terminal or your Java IDE.
3. Compile and run the file:

```bash
javac HotelManagementSystem.java
java HotelManagementSystem
