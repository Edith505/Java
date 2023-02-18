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
		File phoneBookFile = getOrCreatePhoneBookFile(
				"C:\\Users\\edith\\Documents\\BOSS MANOA\\JAVA\\first-app\\phonebook.txt");

		try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter(phoneBookFile, true));
			fileWriter.append(newContact.toString() + "\n");
			fileWriter.append('\n');
			System.out.println("contact ajouter");
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

	public static File getOrCreatePhoneBookFile(String phoneBookFilePath) {
		File phoneBookFile = new File(phoneBookFilePath);
		if (phoneBookFile.exists()) {
			return phoneBookFile;
		}

		try {
			phoneBookFile.createNewFile();
			System.out.println("Le fichier a ete creer (" + phoneBookFilePath + ")");
			return phoneBookFile;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
