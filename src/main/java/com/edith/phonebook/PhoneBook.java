package com.edith.phonebook;

import java.util.Scanner;

public class PhoneBook {

	public static Scanner sc = null;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		String userLastName = getUserInput("Entrer votre Nom : ");
		String userFirstName = getUserInput("Entrer votre Prenom : ");
		String userPhoneNumber = getUserInput("Entrer votre Numero de telephone : ");

		System.out.println(userLastName);
		System.out.println(userFirstName);
		System.out.println(userPhoneNumber);

		System.out.println("Vous avez saisi les informations suivantes { Nom : " + userLastName + " ; Prenom : " +userFirstName+ " ; Numero telephone : " +userPhoneNumber + " }");
		sc.close();

	}
	public static String getUserInput(String userMessage){
		System.out.println(userMessage);
		String userType = sc.nextLine();
		return userType;
	}

}
