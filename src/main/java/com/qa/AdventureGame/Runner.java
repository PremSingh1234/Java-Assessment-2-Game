package com.qa.AdventureGame;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Enter name: ");
		String name = PlayerAction.input();
		System.out.println("Hello " + name + " " + "You are stranded in the middle of an infinite grey swamp," + " " + "suddenly a grey foggy clouds float oppressively close to you, \r\n" + 
				"reflected in the murky grey water which reaches up your shins.\r\n" + 
				"Some black plants barely poke out of the shallow water.\r\n" + 
				"Try \"north\", \"south\", \"east\", or \"west\"\r\n" + 
				"You notice a small watch-like device in your left hand.  \r\n" + 
				"It has hands like a watch, but the hands don't seem to tell time. \r\n" + 
				"");
	
	}

}