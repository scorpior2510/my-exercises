# Exercise: Default and Static interface methods

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 6

## ChatGpt Prompt
please create 4 short exercises practicing java interfaces with emphasize on default and static methods.
difficulty should range from 4/10 to 7/10.

## Description

### Exercise 1: Basic Default Method Implementation (4/10)
Create an interface Greeter with a default method greet() that prints "Hello!". Implement this interface in a class FriendlyPerson and test the method.

---

### Exercise 2: Overriding a Default Method (5/10)
Modify the previous exercise so that FriendlyPerson overrides the greet() method to print "Hi there!". Demonstrate how the overridden method works.

---

### Exercise 3: Using Static Methods in Interfaces (6/10)
Define an interface MathOperations with:

A static method add(int a, int b) that returns the sum.
A static method multiply(int a, int b) that returns the product.
Call these methods from the main method without creating an instance.

---

### Exercise 4: Multiple Interfaces with Conflicting Default Methods (7/10)
Define two interfaces:

InterfaceA with a default method show() that prints "InterfaceA show".
InterfaceB with a default method show() that prints "InterfaceB show".
Create a class MultiInterfaceClass that implements both interfaces. Resolve the conflict by overriding show().

---

### Exercise 5: Payment Processing System (8/10)
Objective: Implement a payment processing system where different payment methods share common behavior but can also have custom implementations.

Requirements:
Create an interface PaymentMethod with the following methods:

boolean processPayment(double amount); (abstract – must be implemented by all classes)
default void printReceipt(double amount) – prints "Payment of $<amount> processed successfully."
static boolean validateAmount(double amount) – returns true if amount > 0, otherwise false.
Implement two classes:

CreditCardPayment: Implements processPayment(), simulating a successful transaction if the amount is under $1000.
PayPalPayment: Implements processPayment(), requiring an extra step to simulate a PayPal authentication check before approving the payment.
In the main method:

Create instances of CreditCardPayment and PayPalPayment.
Use validateAmount() before processing a payment.
Call processPayment() and printReceipt().
Hints:

The default method printReceipt() is used because receipts are common across payment types.
The static method validateAmount() ensures that negative or zero payments are rejected before processing.

---

### Exercise 6: Smart Home Devices (8/10)
Objective: Create a smart home device system where devices have common behaviors but can extend functionalities.

Requirements:
Create an interface SmartDevice with the following methods:

void turnOn(); (abstract – all devices must implement this)
void turnOff(); (abstract – all devices must implement this)
default void connectToWiFi(String network) – prints "Connecting to <network>..." and assumes successful connection.
static void troubleshoot() – prints "Try restarting your device or checking your internet connection."
Implement two classes:

SmartLight: Implements turnOn() and turnOff(), printing "Light is ON" and "Light is OFF".
SmartSpeaker: Implements turnOn() and turnOff(), printing "Speaker is playing music" and "Speaker is OFF".
In the main method:

Create instances of SmartLight and SmartSpeaker.
Call connectToWiFi() on both.
Toggle their power state.
If a connection issue occurs, call SmartDevice.troubleshoot().
Hints:

The default method connectToWiFi() applies to all smart devices, so it's reasonable to have a default implementation.
The static method troubleshoot() provides general help for all devices, making it logical to define in the interface.