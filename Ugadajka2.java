package test.HomeWork;

import java.util.Random;
import java.util.Scanner;
/*
 * Mawina zagadivaet cislo
 * User pitaetsa ugadatj
 * Mawina daet podskazki Less,More,Equal
 * Esli cislo ugadano to programa vidaet "You wonn" i prekrawaet rabotu.
 */
public class Ugadajka2 {

	public static void main(String[] args) {
		int min = 0, max = 10;
		Random rand = new Random(10);
		int guess = rand.nextInt(11);
		System.out.println(guess);
		System.out.println("Try to guess a number from 1 to 10");
		System.out.println(" ");
		Scanner in = new Scanner(System.in);
		int number = Integer.valueOf(in.nextLine());
		System.out.println("Your choice is: " + number);
		boolean result = false;
		while (result != true) {
			if (guess > number) {
				result = false;
				System.out.println("The nuber should be greater, please choose another one");
				number = Integer.valueOf(in.nextLine());
				System.out.println("You choice is: " + number);
			} else if (guess < number) {
				result = false;
				System.out.println("The nuber should be less, please choose another one");
				number = Integer.valueOf(in.nextLine());
				System.out.println("You choice is: " + number);
			} else if (guess == number) {
				result = true;
				System.out.println("You wonn!");
				break;
			}

		}
	}
}
