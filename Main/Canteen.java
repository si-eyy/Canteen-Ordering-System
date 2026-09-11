import java.util.Scanner;

public class Canteen {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display menu
        String[] itemNames = {"Burger", "Pizza", "Pasta", "Sandwich", "Milk Tea"};

        double[] itemPrices = {80.00, 120.00, 100.00, 70.00, 90.00};

        int totalQuantity = 0;
        double totalBeforeDiscount = 0.0;
        double totalDiscount = 0.0;
        double totalFinalAmount = 0.0;

        displayMenu(itemNames, itemPrices);

    }
}
