package org.lesson.java;

import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        
        double price = 0.21;
        double discountOver = 0.40;
        double discountUnder = 0.20;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quanti Km vuoi percorrere? Il biglietto costa " + price + "\u20AC al Km");
        int distance = sc.nextInt();
        
        System.out.print("Inserire la tua età: ");
        int age = sc.nextInt();
       
        sc.close(); 
        
        System.out.println("-------------------------------------");

        double totalPrice = price * distance;
        double totalPriceOver = totalPrice - (totalPrice * discountOver);
        double totalPriceUnder = totalPrice - (totalPrice * discountUnder);
        
        String format = "%.2f";
        
        if (age > 65) {
        	
            String formattedTotalPriceOver = String.format(format, totalPriceOver);
            
            System.out.println("Il prezzo del biglietto è: " + formattedTotalPriceOver + "\u20AC");
        } else if (age < 18) {
        	
            String formattedTotalPriceUnder = String.format(format, totalPriceUnder);
            
            System.out.println("Il prezzo del biglietto è: " + formattedTotalPriceUnder + "\u20AC");
            
        } else {
        	
            String formattedTotalPrice = String.format(format, totalPrice);
            
            System.out.println("Il prezzo del biglietto è: " + formattedTotalPrice + "\u20AC");
        }
        
      
    }
}

