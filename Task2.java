package test.HomeWork;

import java.util.Random;
import java.util.Scanner;

/* 
 * 1.Poljzovatelj vvodit cislo ot 1 do 100
 * 2. Programma vivodit cislo
 * 3. Poljzovatelj piwet bilo eto cislo menjwe (less), boljwe (more) ili pavno
 * 4. Programma scitivaet stroku
 * 5. Programma pitaetsa ugadatj cislo ucitivaja prediduwij wag
 */
public class Task2 {

	public static void main(String[] args) {
		int min = 0, max = 10;
		Random rand = new Random(10);
		System.out.println("Choose a number from 1 to 10");
		System.out.println(" ");
		Scanner in = new Scanner(System.in);
		int number = Integer.valueOf(in.nextLine());
		System.out.println("Your choice is: " + number);

		int guess = rand.nextInt(11);
		System.out.println("Please choose is it M(More), L(Less) or E(equal) to " + guess);
		String enteredLine = in.nextLine();

		boolean result = false;
		while (result != true) {
			if (enteredLine.equalsIgnoreCase("E")) {
				result = true;
				System.out.println("You wonn, the number is  " + guess);
				break;
			} else if (enteredLine.equalsIgnoreCase("L")) {
				max = guess;
				result = false;
			} else if (enteredLine.equalsIgnoreCase("M")) {
				min = guess;
				result = false;
			}
			int n = max - min + 1;
			guess = rand.nextInt(11);
			System.out.println("Please choose again is it M (more), L (less) or E to: " + guess);
			enteredLine = in.nextLine();
		}
	}

}
