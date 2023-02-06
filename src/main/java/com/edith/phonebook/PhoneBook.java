package com.edith.phonebook;

import java.util.Scanner;

public class PhoneBook {

	public static Scanner sc = null;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		String userLastName = getUserInput("Entrer votre Nom : ");
		String userFirstName = getUserInput("Entrer votre Prenom : ");
		String userPhoneNumber = getUserInput("Entrer votre Numero de telephone : ");

		Contact newContact = new Contact(userLastName, userFirstName, userPhoneNumber);
		newContact.setLastName(userLastName);
		newContact.setFirstName(userFirstName);
		newContact.setPhoneNumber(userPhoneNumber);

		System.out.println("Vous avez saisi les informations suivantes { Nom : " + userLastName + " ; Prenom : "
				+ userFirstName + " ; Numero telephone : " + userPhoneNumber + " }");

		System.out.println(newContact);

		sc.close();

	}

	public static String getUserInput(String userMessage) {
		System.out.println(userMessage);
		return sc.nextLine();
	}

}
