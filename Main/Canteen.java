import java.util.Scanner;

public class Canteen {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display menu
        String[] itemNames = {"Burger", "Pizza", "Pasta", "Sandwich", "Milk Tea"};
        double[] itemPrices = {80.00, 120.00, 100.00, 70.00, 90.00};

        // Initialize variables to keep track of total quantities and amounts
        int totalQuantity = 0;
        double totalBeforeDiscount = 0.0;
        double totalDiscount = 0.0;
        double totalFinalAmount = 0.0;

        displayMenu(itemNames, itemPrices);

        char orderAgain;
        do { 
            System.out.print("Enter item number");
            int itemNumber = input.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            boolean validItem = itemNumber >= 1 && itemNumber <= itemNames.length;
            boolean validQuantity = quantity >= 1 && quantity <= 10;

            if (!validItem || !validQuantity) {
                System.out.println("\nInvalid order!\n");
                System.out.println("\nPlease enter a valid item number and quantity.\n");
            } else {
                System.out.print("Are you a student? (Y/N): ");
                char studentAnswer = input.next().charAt(0);
                boolean isStudent = (studentAnswer == 'Y' || studentAnswer == 'y');
                
                double price = itemPrices[itemNumber - 1];
                double subtotal = price * quantity;

                double discountRate;
                if (isStudent && subtotal >= 500.00) {
                    discountRate = 0.15;
            } else if (subtotal >= 500.00) {
                discountRate = 0.05;
            } else if (isStudent) {
                discountRate = 0.10;
            } else {
                discountRate = 0.0;
            }


            double discount = subtotal * discountRate;
            double orderTotal = subtotal - discount;    

            System.out.printf("%nSubtotal: $%.2f%n", subtotal);
            System.out.printf("Discount: $%.2f%n", discount);
            System.out.printf("Order total: $%.2f%n", orderTotal);
    }
}
