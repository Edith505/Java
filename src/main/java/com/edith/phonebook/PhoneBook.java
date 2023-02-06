package com.edith.phonebook;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre Nom : ");
		String Name = sc.nextLine();
		System.out.println(Name);


		sc.close();

	}

}
