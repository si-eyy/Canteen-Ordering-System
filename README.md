# Canteen Ordering System (˶˃ ᵕ ˂˶) .ᐟ.ᐟ

A simple Java console application that simulates a school canteen ordering process. Customers can browse a menu, place one or more orders, and receive automatic discounts based on their student status and purchase amount.

## Features

- Displays a canteen menu with at least five food items and their prices
- Accepts item number, quantity, and student status (Y/N) for each order
- Validates every order:
  - Item number must exist on the menu
  - Quantity must be between 1 and 10
  - Invalid orders are rejected with a message and skipped from totals
- Applies discounts based on the following rules:
  - **Student:** 10% off
  - **Purchase of $500 or more:** 5% off
  - **Student with a purchase of $500 or more:** 15% off
  - No qualifying condition: no discount
- Allows the customer to place multiple orders in a single session
- Tracks running totals across the transaction
- Displays a final order summary:
  - Total quantity of items purchased
  - Total amount before discounts
  - Total discount applied
  - Final amount to pay

## How It Works

1. The program displays the menu.
2. The customer enters an item number, quantity, and whether they are a student.
3. The order is validated. Invalid orders display an error message, and the customer is prompted to try again without affecting the running totals.
4. Valid orders calculate a subtotal, apply the appropriate discount, and display the order total.
5. The customer is asked whether they want to place another order (`Y`/`N`).
6. Once the customer enters `N`, the program prints a final summary of the entire transaction.

## Technologies Used

- Java (Scanner-based console I/O)

## Running the Program

```bash
javac CanteenOrderingSystem.java
java CanteenOrderingSystem
```

## Sample Output

```
====    M E N U    ====

1. Burger                - $80.00
2. Pizza                 - $120.00
3. Pasta                 - $100.00
4. Sandwich              - $70.00
5. Milk Tea              - $90.00

Enter item number: 2
Enter quantity: 3
Are you a student? (Y/N): Y

Subtotal: $360.00
Discount: $36.00
Order total: $324.00

Do you want to order again? (Y/N): Y

Enter item number: 6
Enter quantity: 2

Invalid order!

Please enter a valid item and quantity.

Do you want to order again? (Y/N): Y
Enter item number: 1
Enter quantity: 7
Are you a student? (Y/N): y
Subtotal: $560.00
Discount: $84.00
Order total: $476.00
Do you want to order again? (Y/N): N

==== ORDER SUMMARY ====

Total items: 10
Total before discount: $920.00
Total discount: $120.00
Final amount: $800.00

Thank you for ordering!
```

## Author

Charles Amelano  ᶻ 𝘇 𐰁 
