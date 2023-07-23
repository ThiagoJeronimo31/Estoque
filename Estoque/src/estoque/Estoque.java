package estoque;

import entities.Calcestoque;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        Calcestoque cE = new Calcestoque();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        cE.name = sc.nextLine();
        System.out.print("Price: ");
        cE.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        cE.quantity = sc.nextInt();
        
        System.out.println(cE);
        
        int quantity;
        System.out.println("");
        System.out.println("Enter the number of products to be added in Stock: ");
        quantity = sc.nextInt();
        cE.addProducts(quantity);
        
        System.out.println("");
        System.out.println("Updated data: "+cE);
        
        System.out.println("");
        System.out.println("Enter the number of products to be removed in Stock: ");
        quantity = sc.nextInt();
        cE.removeProducts(quantity);
        
        System.out.println("Updated data: "+cE);
        
        
        
        
        
        
        
        
        
        sc.close();
        
        
        
    }
    
}
