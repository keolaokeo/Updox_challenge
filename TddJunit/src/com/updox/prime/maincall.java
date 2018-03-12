package com.updox.prime;

import java.util.Scanner;

public class maincall {
	public static void main(String[] args) {
        System.out.print("Enter Starting Number:");
		Scanner keyboard = new Scanner(System.in);
		int BegNumber = keyboard.nextInt();

		System.out.print("Enter Stopping Number:");
		int EndNumber = keyboard.nextInt();

        keyboard.close();

        Prime myPrime = new Prime();
        
        myPrime.generate(BegNumber,EndNumber);
    }
}
