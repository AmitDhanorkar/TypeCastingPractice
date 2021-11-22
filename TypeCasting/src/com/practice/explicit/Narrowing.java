package com.practice.explicit;

import java.util.Scanner;

public class Narrowing {

	public static void main(String[] args) {
		//Below implemented explicit type casting or narrowing
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer value");
		int v = sc.nextInt();
		char c = (char)v;
		
		System.out.println("Character value of given integer : "+c);

	}

}
