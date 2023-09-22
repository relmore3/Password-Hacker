package CPSC4363;

import java.util.Scanner;

public class password {
	public static void main(String[] args) {
		 
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Input a 4-pin password. Only numbers and letters (case-sensitive) are accepted: ");
		String password = scanner.nextLine();

		if (password.length() != 4) {
		    System.out.println("Invalid: Incorrent password length.");
		    return;
		}
		if (!(Character.isLetterOrDigit(password.charAt(0)) &&
		        Character.isLetterOrDigit(password.charAt(1)) &&
		        Character.isLetterOrDigit(password.charAt(2)) &&
		        Character.isLetterOrDigit(password.charAt(3)))) {
		    System.out.println("Invalid: Check password and try again.");
		    return;
		}

		String possibleLetters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		long start = System.currentTimeMillis();

		for (int i = 0; i < possibleLetters.length(); i++) {
		    for (int j = 0; j < possibleLetters.length(); j++) {
		        for (int k = 0; k < possibleLetters.length(); k++) {
		            for (int m = 0; m < possibleLetters.length(); m++) {
		                String guess = String.valueOf(possibleLetters.charAt(i)) + String.valueOf(possibleLetters.charAt(j)) +
		                        String.valueOf(possibleLetters.charAt(k)) + String.valueOf(possibleLetters.charAt(m));
		                if(guess.equals(password)){
		                   
		                    break;
		                }
		            }
		        }
		    }
		}


		long stop = System.currentTimeMillis();

		System.out.println("Your password can be hacked within " + (stop - start) + " ms");
	}


    }

	}


