package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
        Product product = new Product(name, price, quantity);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Price: ");
        double price1 = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity1 = sc.nextInt();

        Product product1 = new Product(name1, price1);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Price: ");
        double price2 = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity2 = sc.nextInt();

        Product product2 = new Product(name2, price2, quantity2);
		
		System.out.println();
        System.out.println("Product data: " + product);
        System.out.println("Product data: " + product1);
        System.out.println("Product data: " + product2);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.print("Enter the number of products to be added in stock: ");
        quantity1 = sc.nextInt();
        product.addProducts(quantity1);

        System.out.print("Enter the number of products to be added in stock: ");
        quantity2 = sc.nextInt();
        product.addProducts(quantity2);
		
		System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println("Updated data: " + product1);
        System.out.println("Updated data: " + product2);
		
		System.out.println();
		System.out.print("Enter the number of the products to be removed from stock: ");
		quantity = sc.nextInt();
        product.removeProducts(quantity);
        
        System.out.print("Enter the number of the products to be removed from stock: ");
        quantity1 = sc.nextInt();
        product.removeProducts(quantity1);

        System.out.print("Enter the number of the products to be removed from stock: ");
        quantity2 = sc.nextInt();
        product.removeProducts(quantity2);
		
		System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println("Updated data: " + product1);
        System.out.println("Updated data: " + product2);
		
		sc.close();        
    }
}