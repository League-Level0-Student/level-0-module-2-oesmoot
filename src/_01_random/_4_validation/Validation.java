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

		// 2. Repeat all the code above 10 times
		for (int complimentCount = 0;complimentCount < 10; complimentCount ++) {
			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null, "YOU ARE ALIVE!!!!!!!!!!!!");
			}
			if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "YOU CAN BREATHE!!!!!!!!!!!!!!!");
		}
			if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "YOU ARE HUMAN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  ");
			}
			if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "YOU CAN WALK!!!!!!!!!!!!!!!!");
			}
		// 3. Find someone to test out your program. They will like it :)
	}
	}
}
