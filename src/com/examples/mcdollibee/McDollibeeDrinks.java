package com.examples.mcdollibee;

import java.util.Scanner;

public class McDollibeeDrinks {
		
	private int price;
	
	public void execute() {
		DrinkMenu.DrinksMenu();
		 System.out.println("Input the number you want to choose");

	        Scanner input = new Scanner(System.in);
	        short choose = input.nextShort();
	        System.out.println(choose);
	        
	        if(choose == 1) {
	        	System.out.println("You chose Coke");
	    		System.out.println("How many do you want to order?");
	    		
	    		short quantity = input.nextShort();
	    		
	    		System.out.println("Price for " + quantity + " Coke is"+ (45 * quantity));
	    		this.price += 45 * quantity;
	    		
	    		
	             
	             System.out.println("Your total amount is "  + this.price);
	             System.out.println("Enter a payment");
	             int paymentAmount = input.nextInt();
	             
	             if (paymentAmount < this.price) {
	                 System.out.println("Payment amount is not sufficient");
	             } else {
	                 System.out.println("Your change is P " + (paymentAmount - this.price));
	                 System.out.println("Thank you for dining with us");
	             } 
	            
		    }else if(choose == 2) {
		    	System.out.println("You chose Sprite");
	    		System.out.println("How many do you want to order?");
	    		
	    		short quantity = input.nextShort();
	    		
	    		System.out.println("Price for " + quantity + " Sprite is"+ (40 * quantity));
	    		this.price += 45 * quantity;
	    		
	    		
	             
	             System.out.println("Your total amount is "  + this.price);
	             System.out.println("Enter a payment");
	             int paymentAmount = input.nextInt();
	             
	             if (paymentAmount < this.price) {
	                 System.out.println("Payment amount is not sufficient");
	             } else {
	                 System.out.println("Your change is P " + (paymentAmount - this.price));
	                 System.out.println("Thank you for dining with us");
	             } 
		  }else if( choose == 3) {
			  System.out.println("You chose Royal");
	    		System.out.println("How many do you want to order?");
	    		
	    		short quantity = input.nextShort();
	    		
	    		System.out.println("Price for " + quantity + " Royal is"+ (35 * quantity));
	    		this.price += 45 * quantity;
	    		
	    		
	             
	             System.out.println("Your total amount is "  + this.price);
	             System.out.println("Enter a payment");
	             int paymentAmount = input.nextInt();
	             
	             if (paymentAmount < this.price) {
	                 System.out.println("Payment amount is not sufficient");
	             } else {
	                 System.out.println("Your change is P " + (paymentAmount - this.price));
	                 System.out.println("Thank you for dining with us");
	             } 
		  }
	}
}
