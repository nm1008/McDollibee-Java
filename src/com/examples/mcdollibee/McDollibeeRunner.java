package com.examples.mcdollibee;

import java.util.Scanner;

public class McDollibeeRunner {

	public static void main(String[] args) {

		McDollibeeMenu.Menu();
		McDollibeeSandwich sandwich = new McDollibeeSandwich();
		McDollibeeDrinks drinks = new McDollibeeDrinks();
	
		System.out.println("Input the number you want to choose");
		Scanner input = new Scanner(System.in);
        short choose = input.nextShort();
        
        if(choose == 1) {
        	sandwich.execute();
        }else if(choose == 2) {
        	drinks.execute();
        }else {
        	return;
        }
	}

}
