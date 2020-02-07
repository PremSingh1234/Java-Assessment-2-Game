package com.qa.AdventureGame;

import java.util.Scanner;

public class PlayerAction {
	private static boolean north;

	
	
	public static String input() {
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		return value;
	}
	
	public static String input(boolean answer) {
		Scanner scanner = new Scanner(System.in);
		if(answer = north) {
			return "Nice choice";
		} else if (false);
		return "You die";	
	}
	
}