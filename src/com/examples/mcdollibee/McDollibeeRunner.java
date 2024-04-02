package com.examples.mcdollibee;

import java.util.Scanner;

public class McDollibeeRunner {

	public static void main(String[] args) {

		McDollibeeMenu.Menu();
		McDollibeeSandwich sandwich = new McDollibeeSandwich();
		McDollibeeDrinks drinks = new McDollibeeDrinks();

		System.out.println("Input the number you want to choose");
		Scanner input = new Scanner(System.in);
		int choose = input.nextInt();

		if (choose == 1) {
			sandwich.executeSandwich();
		} else if (choose == 2) {
			drinks.executeDrinks();
		} else {
			System.out.println("Transaction was cancelled");
			System.out.println("Thank you for dining with us");
			return;
		}
	}

}
