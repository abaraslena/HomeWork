package test;

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
		int min=0, max=100;
		Random rand=new Random(100);
		System.out.println("Choose a number from 1 to 100");
		System.out.println(" ");
		Scanner in = new Scanner(System.in);
		int number = Integer.valueOf(in.nextLine());
		System.out.println("Your choice is: " + number);
		
		int guess = rand.nextInt(96);
		System.out.println("Is it M(More) or L(Less) or E(equal) " + guess);
		Scanner an = new Scanner(System.in);
		System.out.println("Enter string: ");
		String enteredLine = an.nextLine();
		boolean result = false;
		while (guess != number) {
			if (enteredLine ==("Y")) {
				System.out.println("You wonn");
				System.exit(0);
			}else
				if (enteredLine == "L") {
					max = guess;
					guess = guess-(max-min);
					result = true;
				}else if (enteredLine == "M"){
					min = guess;
					guess = guess + (max-min);
					result = true;
				}
			if (result){
			System.out.println(guess + " ");
			result = false;
//			System.out.println();
		}
	}

	}
}	
