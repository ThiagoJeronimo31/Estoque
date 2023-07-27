package estoque;

import entities.Calcestoque;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
      
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();
        Calcestoque cE = new Calcestoque(name,price,quantity);
        
        System.out.println(cE);
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
