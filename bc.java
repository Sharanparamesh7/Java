import java.util.Scanner;

public class bc {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter the number of items: ");
      int numItems = scanner.nextInt();
      
      double totalCost = 0.0;
      
      for (int i = 1; i <= numItems; i++) {
         System.out.print("Enter the cost of item " + i + ": ");
         double itemCost = scanner.nextDouble();
         totalCost += itemCost;
      }
      
      System.out.print("Enter the tax rate (e.g. 0.05 for 5%): ");
      double taxRate = scanner.nextDouble();
      
      double taxAmount = totalCost * taxRate;
      double finalCost = totalCost + taxAmount;
      
      System.out.println("\nTotal cost: " + totalCost);
      System.out.println("Tax amount: " + taxAmount);
      System.out.println("Final cost: " + finalCost);
   }
}





