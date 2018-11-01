package Lab17;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class PrimeNumTest {

	@Test
	void primes1() {
		Scanner scnr = new Scanner(System.in);
		
	}
	
	@Test
	void primes2() {
		ArrayList<Integer> primeNums = new ArrayList<>();
		
	}
	
	@Test
	void primes3() {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> primeNums = new ArrayList<>();
		primeNums.addAll(PrimeNums.getPrimes(10000));
	}
	
	@Test
	void primes4() {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> primeNums = new ArrayList<>();
		primeNums.addAll(PrimeNums.getPrimes(10000));
		String userChoice = null;
	}
	
	@Test
	void primes5() {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> primeNums = new ArrayList<>();
		primeNums.addAll(PrimeNums.getPrimes(10000));
		String userChoice = null;
		
		System.out.println("Hello! Welcome to the 'Totally Cool...No Really...Learning is Cool' prime number generator!!");
		System.out.println();
		System.out.println("Let's find some prime numbers!");
		System.out.println();
	}
	
	@Test
	void primes6() {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> primeNums = new ArrayList<>();
		primeNums.addAll(PrimeNums.getPrimes(10000));
		String userChoice = null;
		
		System.out.println("Hello! Welcome to the 'Totally Cool...No Really...Learning is Cool' prime number generator!!");
		System.out.println();
		System.out.println("Let's find some prime numbers!");
		System.out.println();
		
		
		do {
		System.out.println("Enter the number you'd like to see: ");
		int userPrime = scnr.nextInt();
		int temp = primeNums.get(userPrime);
		System.out.println("The number " + userPrime + " prime is " + temp + "\n");
		System.out.println("Would you lke to find another prime number? (y/n)");
		userChoice = scnr.next();

	}while (userChoice.equalsIgnoreCase("y"));
	}
	
	@Test
	void primes7() {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> primeNums = new ArrayList<>();
		primeNums.addAll(PrimeNums.getPrimes(10000));
		String userChoice = null;
		
		System.out.println("Hello! Welcome to the 'Totally Cool...No Really...Learning is Cool' prime number generator!!");
		System.out.println();
		System.out.println("Let's find some prime numbers!");
		System.out.println();
		
		
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
