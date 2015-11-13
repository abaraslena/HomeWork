package test.HomeWork;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum MenuItem {
	ADD(1), PRINT(2), DELETE(3), SAVE(4), LOAD(5), EXIT(6);

	private int number;

	private MenuItem(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}

public class ShoppingList {
	private static List<String> list = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int input;

		do {
			printMenu();

			input = getUserInput();

			if (input == MenuItem.PRINT.getNumber()) {
				System.out.println(list);
			} else if (input == MenuItem.ADD.getNumber()) {
				addToList();
			} else if (input == MenuItem.DELETE.getNumber()) {
				System.out.println("Please enter item that should be deleted:");
				String item = scanner.nextLine();
				list.remove(item);

			} else if (input == MenuItem.SAVE.getNumber()) {
				try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get("text.txt")))) {
					for (String s : list) {
						writer.println(s);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (input == MenuItem.LOAD.getNumber()) {
				try (BufferedReader reader = Files.newBufferedReader(Paths.get("text.txt"))) {
					String line = null;
					while ((line = reader.readLine()) != null) {
						list.add(line);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			System.out.println("Please enter to continue");
			scanner.nextLine();

		} while (MenuItem.EXIT.getNumber() != input);

	}

	private static int getUserInput() {
		int input;
		input = scanner.nextInt();
		scanner.nextLine();
		return input;
	}

	private static void addToList() {
		System.out.println("Enter item:");
		String item = scanner.nextLine();
		list.add(item);
	}

	private static void printMenu() {
		System.out.println("This is a shopping list application. Enter your choice:");
		System.out.println(MenuItem.ADD.getNumber() + " - add an item");
		System.out.println(MenuItem.PRINT.getNumber() + " - list items");
		System.out.println(MenuItem.DELETE.getNumber() + " - delete an item");
		System.out.println(MenuItem.SAVE.getNumber() + " - save list to file");
		System.out.println(MenuItem.LOAD.getNumber() + " - load list from file");
		System.out.println(MenuItem.EXIT.getNumber() + " - exit");
	}
}