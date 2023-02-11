package com.edith.phonebook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
		System.out.println(newContact.toString());

		File phoneBookFile = new File("C:\\Users\\edith\\Documents\\BOSS MANOA\\JAVA\\first-app\\phonebook.txt");
		if (phoneBookFile.exists())
			System.out.println("Le fichier existe a l'emplacement donner");
		else
			System.out.println("Le fichier n'existe pas");

		try {
			phoneBookFile.createNewFile();
			System.out.println("Le fichier a ete creer");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter(phoneBookFile, true));
			fileWriter.append(newContact.toString());
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();

	}

	public static String getUserInput(String userMessage) {
		System.out.println(userMessage);
		return sc.nextLine();
	}

}
