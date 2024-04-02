package com.examples.mcdollibee;

import java.util.ArrayList;
import java.util.Scanner;

public class McDollibeeSandwich {
	private double price;

	// Method to handle user input for additional ingredients
	private void handleAddOns(ArrayList<Integer> addOns, Scanner input) {
		do {
			AddOnIngredient.AddOnIngredient();
			System.out.println("Input the number you want to add to the burger");
			short option_add_on = input.nextShort();

			if (option_add_on == 1) {
				System.out.println("You just added Lettuce in your order");
				addOns.add((int) Ingredients.price_lettuce);
			} else if (option_add_on == 2) {
				System.out.println("You just added Bacon in your order");
				addOns.add((int) Ingredients.price_bacon);
			} else if (option_add_on == 3) {
				System.out.println("You just added Tomato in your order");
				addOns.add((int) Ingredients.price_tomato);
			}

			System.out.println("Do you want to add another ingredient? (Y/N)");
		} while (input.next().equalsIgnoreCase("Y"));
	}

	// Method to handle ordering process
	public void executeSandwich() {
		ArrayList<Integer> addOns = new ArrayList<Integer>();

		// Print out the menu
		SandwichMenu.Menu();
		System.out.println("Input the number you want to choose");

		Scanner input = new Scanner(System.in);
		short choose = input.nextShort();

		if (choose == 1) {
			System.out.println("You ordered Big Mac");
			System.out.println("How many you want to order");
			short quantity = input.nextShort();
			this.price += quantity * 120;

			// Ask for additional ingredients
			System.out.println("Do you want any add on? (Y/N)");
			if (input.next().equalsIgnoreCase("Y")) {
				handleAddOns(addOns, input);
			}
		} else if (choose == 2) {
			System.out.println("You ordered Aloha Burger");
			System.out.println("How many you want to order");
			short quantity = input.nextShort();
			this.price += quantity * 100;

			// Ask for additional ingredients
			System.out.println("Do you want any add on? (Y/N)");
			if (input.next().equalsIgnoreCase("Y")) {
				handleAddOns(addOns, input);
			}

			// Calculate total price with add-ons
			for (int sum : addOns) {
				this.price += sum;
			}

			// Print total price and handle payment
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

			// if user cancels the transaction while on the sandwich menu
		} else {
			System.out.println("Transaction was cancelled");
			System.out.println("Thank you for dining with us");
		}
	}
}
