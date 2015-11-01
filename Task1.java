package test;

import java.util.Random;
import java.util.Scanner;
/*
 * 1. Programma po ceredi zaprawivaet cisla a, b, c
 * 2. Sravnivaet cisla vvedennie userom mezdu soboj
 * 3. Programma operedeljaet naiboljwee cislo mezdu a,b, c i vivodit ego v consol
 */
public class Task1 {

	public static void main(String[] args) {
		System.out.println("Enter numbers a");
		System.out.println(" ");
		Scanner in = new Scanner(System.in);
		int a = Integer.valueOf(in.nextLine());
		System.out.println("Your choice for a is: " + a);
		System.out.println("Enter numbers b");
		System.out.println(" ");
		Scanner in2 = new Scanner(System.in);
		int b = Integer.valueOf(in2.nextLine());
		System.out.println("Your choice for b is: " + b);
		System.out.println("Enter numbers c");
		System.out.println(" ");
		Scanner in3 = new Scanner(System.in);
		int c = Integer.valueOf(in3.nextLine());
		System.out.println("Your choice for c is: " + c);
		if (a>b){
			if (a>c){
				System.out.println("a is the maximum number");
			}
			else {
				if (c>b){
					System.out.println("c is the maximum number");
				}
				else{
					System.out.println("b is the maximum number");
				}
			}
		}
		else{
			if (b>c){
				System.out.println("b is the maximum number");
			}
		}
	}
}
