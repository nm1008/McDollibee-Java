package com.examples.mcdollibee;

import java.util.Scanner;

public class McDollibeeDrinks {

	private double price;

	// Method that handles additional order
	private void handleAddOns(Scanner input) {
		if (input.next().equalsIgnoreCase("Y")) {
			executeDrinks();
		}

		// if user is done adding items this will prompt
		System.out.println("Your total amount is " + this.price);
		System.out.println("Enter payment amount:");
		int paymentAmount = input.nextInt();

		// Validation if user gives amount lower than the total amount of the food
		while (paymentAmount < this.price) {
			System.out.println("Payment amount is insufficient. Enter an amount:");
			paymentAmount = input.nextInt();
		}

		System.out.println("Your change is " + (paymentAmount - this.price));
		System.out.println("Thank you for dining with us");
	}

	public void executeDrinks() {

		DrinkMenu.DrinksMenu();
		System.out.println("Input the number you want to choose");

		Scanner input = new Scanner(System.in);
		short choose = input.nextShort();

		// options
		if (choose == 1) {
			System.out.println("You chose Coke");
			System.out.println("How many do you want to order?");

			short quantity = input.nextShort();
			this.price += 45 * quantity;

			System.out.println(this.price);

			System.out.println("Do you want any add on? (Y/N)");
			handleAddOns(input);

		} else if (choose == 2) {
			System.out.println("You chose Sprite");
			System.out.println("How many do you want to order?");

			short quantity = input.nextShort();
			this.price += 40 * quantity;

			System.out.println(this.price);

			System.out.println("Do you want any add on? (Y/N)");
			handleAddOns(input);

		} else if (choose == 3) {
			System.out.println("You chose Royal");
			System.out.println("How many do you want to order?");

			short quantity = input.nextShort();
			this.price += 35 * quantity;

			System.out.println(this.price);

			System.out.println("Do you want any add on? (Y/N)");
			handleAddOns(input);

			// if user cancelled the order while on the menu section
		} else {
			System.out.println("Transaction was cancelled");
			System.out.println("Thank you for dining with us");
		}
	}
}
