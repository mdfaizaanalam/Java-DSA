import java.util.*;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        double costPrice = sc.nextDouble();
        System.out.print("Enter the selling price: ");
        double sellingPrice = sc.nextDouble();

        profitLoss(costPrice, sellingPrice);
        sc.close();
    }

    public static void profitLoss(double costPrice, double sellingPrice) {
        if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("Loss incured by the seller: " + loss);
        } 
        else if (costPrice < sellingPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("Profit made by the seller: " + profit);
        } 
        else {
            System.out.println("Neither profit nor loss by the seller");
        }
        
    }
    
}
