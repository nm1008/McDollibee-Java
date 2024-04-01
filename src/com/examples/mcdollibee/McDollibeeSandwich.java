package com.examples.mcdollibee;

import java.util.ArrayList;
import java.util.Scanner;

public class McDollibeeSandwich {
	private double price;

	public void execute() {
		ArrayList<Integer> addOns = new ArrayList<Integer>();
		SandwichMenu.Menu();
		System.out.println("Input the number you want to choose");

		Scanner input = new Scanner(System.in);
		short choose = input.nextShort();

		if (choose == 1) {
			System.out.println("You ordered Big Mac");
			System.out.println("How many you want to order");
			short quantity = input.nextShort();
			this.price += quantity * 120;
			System.out.println("Do you want any add on?");
			System.out.println("Press Y for Yes and N for N : ");
			String again = input.next();

			if (again.equalsIgnoreCase("Y")) {
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
					again = input.next();

				} while (again.equalsIgnoreCase("Y"));

				// if user answered N after the do while loop it stops
				for (int sum : addOns) {
					this.price += sum;
				}

				System.out.println("Your total amount is " + this.price);
				System.out.println("Enter a payment");
				int paymentAmount = input.nextInt();

				int userBalance = paymentAmount;
				while (userBalance < this.price) {
					System.out.println("Payment amount is insufficient");
					System.out.println("Enter an amount");
					int paymentAmountAgain = input.nextInt();
					userBalance = paymentAmountAgain;
				}
				System.out.println("Your change is P " + (userBalance - this.price));
				System.out.println("Thank you for dining with us");

			} else {
				for (int sum : addOns) {
					this.price += sum;
				}

				System.out.println("Your total amount is " + this.price);
				System.out.println("Enter a payment");
				int paymentAmount = input.nextInt();

				int userBalance = paymentAmount;
				while (userBalance < this.price) {
					System.out.println("Payment amount is insufficient");
					System.out.println("Enter an amount");
					int paymentAmountAgain = input.nextInt();
					userBalance = paymentAmountAgain;
				}
				System.out.println("Your change is P " + (userBalance - this.price));
				System.out.println("Thank you for dining with us");

			}

		} else if (choose == 2) {

			System.out.println("You ordered Aloha Burger");
			System.out.println("How many you want to order");
			short quantity = input.nextShort();
			this.price += quantity * 100;
			System.out.println("Do you want any add on?");
			System.out.println("Press Y for Yes and N for N : ");

			String again = input.next();
			System.out.println(again);

			if (again.equalsIgnoreCase("Y")) {
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
					again = input.next();

				} while (again.equalsIgnoreCase("Y"));

				// if user answered N after the do while loop it stops

				for (int sum : addOns) {
					this.price += sum;
				}

				System.out.println("Your total amount is " + this.price);
				System.out.println("Enter a payment");
				int paymentAmount = input.nextInt();

				int userBalance = paymentAmount;
				while (userBalance < this.price) {
					System.out.println("Payment amount is insufficient");
					System.out.println("Enter an amount");
					int paymentAmountAgain = input.nextInt();
					userBalance = paymentAmountAgain;
				}
				System.out.println("Your change is P " + (userBalance - this.price));
				System.out.println("Thank you for dining with us");

			} else {
				for (int sum : addOns) {
					this.price += sum;
				}

				System.out.println("Your total amount is " + this.price);
				System.out.println("Enter a payment");
				int paymentAmount = input.nextInt();

				int userBalance = paymentAmount;
				while (userBalance < this.price) {
					System.out.println("Payment amount is insufficient");
					System.out.println("Enter an amount");
					int paymentAmountAgain = input.nextInt();
					userBalance = paymentAmountAgain;
				}
				System.out.println("Your change is P " + (userBalance - this.price));
				System.out.println("Thank you for dining with us");

			}

		} else {
			System.out.println("Thank you for dining with us");

		}
	}
}
