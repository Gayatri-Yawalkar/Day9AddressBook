package com.bridgelabz.addressbook;
//Uc2
import java.util.Scanner;
public class AddNewContact {
	Scanner scanner;
	Contacts newContact;
	public AddNewContact() {
		scanner=new Scanner(System.in);
	}
	public String getString() {
		return scanner.nextLine();
	}
	public void addContact() {
		System.out.println("Enter Person Details to Add New Contact");
		System.out.println("Enter Full Name");
		String firstLastName=getString();
		System.out.println("Enter Address");
		String address=getString();
		System.out.println("Enter City");
		String city=getString();
		System.out.println("Enter State");
		String state=getString();
		System.out.println("Enter Zip");
		long zip=scanner.nextLong();
		System.out.println("Enter Phone Number");
		long phoneNum=scanner.nextLong();
		System.out.println("Enter Email");
		scanner.nextLine();
		String email=getString();
		newContact=new Contacts(firstLastName,address,city,state,zip,phoneNum,email);
	}
	public static void main(String[] args) {
		AddNewContact addressBook=new AddNewContact();
		addressBook.addContact();
	}
}
