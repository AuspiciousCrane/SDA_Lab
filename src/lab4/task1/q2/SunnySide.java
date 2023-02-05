package lab4.task1.q2;

import java.io.*;

public class SunnySide extends EggDish {
	
	public void prepare() {
		System.out.println("Never stir sunny side up!");
	}
	
	public void cook() {
		System.out.println("Cooking the eggs sunny side up.");
	}
	
	public void addSaltAndPepper(){
		System.out.println("Adding Salt and Pepper");
	}

	public boolean customerWantsSaltAndPepper() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
		return true;
		} else {
		return false;
		} 
	}
	private String getUserInput() {
		String answer = null;
		System.out.print("Would you like salt and pepper with your sunny side (y/n)? ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
		  answer = in.readLine();
		} catch (IOException ioe) {
		  System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
		  return "no";
		}
		  return answer;
	  } 
}
