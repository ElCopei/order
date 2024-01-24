package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter client date: ");
       System.out.println("Name: ");
       String name = sc.nextLine();
       System.out.println("Email: ");
       String email = sc.nextLine();
       System.out.println("Enter order data: ");
       System.out.println("Status: ");
       System.out.println("How many itens to this order?");
       int n = sc.nextInt();
       for(int i= 0; i<n;i++){
        sc.nextLine();
        System.out.println("Enter #"+(i+1)+"item data: ");
        System.err.println("Product name: ");

       }

        sc.close();
    }
}
