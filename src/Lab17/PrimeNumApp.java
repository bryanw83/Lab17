package Lab17;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> primeNums = new ArrayList<>();
		String userChoice = null;
		
		System.out.println("Hello! Welcome to the 'Totally Cool...No Really...Learning is Cool' prime number generator!!");
		System.out.println();
		System.out.println("Let's find some prime numbers!");
		System.out.println();

		int primeArray = Validator.getInt(scnr, "How many numbers would you like to search?(Let's keep it under 10000 ok? Don't get greedy): ", 2, 10000);
		
		
		primeNums.addAll(PrimeNums.getPrimes(primeArray));
		
		do {
		System.out.println("Enter the number you'd like to see: ");
		int userPrime = scnr.nextInt();
		int temp = primeNums.get(userPrime);
		System.out.println("The number " + userPrime + " prime is " + temp + "\n");
		System.out.println("Would you lke to find another prime number? (y/n)");
		userChoice = scnr.next();

	}while (userChoice.equalsIgnoreCase("y"));
		
		System.out.println("Ok then...Thanks for coming...Don't be a stranger!.....please?!....");
	}
}
