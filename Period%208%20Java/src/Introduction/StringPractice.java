package Introduction;

import java.util.Scanner;

public class StringPractice {
	
	static Scanner input;
	static String user;
			
	public static void main(String[] args) {
		//demonstrateStringMethods();
		createField(); 
		promptName();
		//promptInput();
		promptForever();
	}
	
	public static void promptName() {
		print("Enter your name.");
		user = input.nextLine();
		print("Wuss poppin b. For the rest of time, imma call you " + user + ". Call me Ya Boi.");
	}

	public static void promptForever() {
		while (true){
			promptInput();
		}
	}

	public static void promptInput() {
		print("Type something " + user + ".");
		String userInput = input.nextLine();
		print("Good stuff. You typed: " + userInput);
	}

	public static void createField() {
		input = new Scanner(System.in);
	}

	public static void demonstrateStringMethods(){
		String text1 = new String("What's poppin world!"); 
		String text2 = "What's poppin world!"; 			//same as above string var
		
		if(text1.equals(text2)){
			print("These strings are equal:");
		}
		print(text1);
		print(text2);
		
		String word1 = "aardvark";
		String word2 = "NotAardvark";
		
		if(word1.compareTo(word2) < 0){
			print("word1 comes before word2.");
		}
	}
	
	public static void print(String text){
		String printString = text;
		int cutoff = 10;
		
		if (printString.length() > cutoff){
			for(int i = 0; i*cutoff < text.length(); i++){
				printString += getCut(text, cutoff, i+1) + "\n";
			}
		}
		System.out.println(printString);
	}
	
	private static String getCut(String text, int cutoff, int cut){
		int cutIndex = cut * cutoff;
		if(cutIndex > text.length()){
			cutIndex = text.length();
		}
		String currentCut = text.substring(0, cutIndex);
		
		int indexOfLastSpace = currentCut.length()-1;
		//start at last index, go backwards
		for(int i = currentCut.length()-1; i >= 0; i--){
			String letter = currentCut.substring(i, i+1);
			if(letter.equals(" ")){
				indexOfLastSpace = i;
				break;
			}
		}
		//shorten cut to end on space
		currentCut = currentCut.substring(0, indexOfLastSpace);
		
		return currentCut;
	}

}
