//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(5);

		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 0) {
			JOptionPane.showInputDialog("You're very athletic.");
		}
		if (randomNumber == 1) {
			JOptionPane.showInputDialog("You are cool.");
		}
			if (randomNumber == 2) {
				JOptionPane.showInputDialog("You're good at art");
			}
				if (randomNumber == 3) {
					JOptionPane.showInputDialog("Your hair is nice");
				}
					if (randomNumber == 4) {
						JOptionPane.showInputDialog("You have a good voice");
					}
					
			

		

		// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}
}
