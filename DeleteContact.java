package com.bridgelabz.addressbook;
//Uc4
import java.util.Scanner;
public class DeleteContact {
	Scanner scanner;
	Contacts newContact;
	public DeleteContact() {
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
		String email=getString();
		newContact=new Contacts(firstLastName,address,city,state,zip,phoneNum,email);
	}
	public void editContact(String name) {
		if(name.equalsIgnoreCase(newContact.firstLastName)) {
			System.out.println("Enter the field you want to change");
			System.out.println("1.Address");
			System.out.println("2.City");
			System.out.println("3.State");
			System.out.println("4.Zip");
			System.out.println("5.Phone Number");
			System.out.println("6.Email");
			System.out.println("Choose Option from 1 to 6");
			int choice=scanner.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter New Address of "+newContact.firstLastName);
					scanner.nextLine();
					newContact.address=scanner.nextLine();
					System.out.println("Address updated Successfully");
					break;
				case 2:
					System.out.println("Enter New City of "+newContact.firstLastName);
					scanner.nextLine();
					newContact.city=scanner.nextLine();
					System.out.println("City updated Successfully");
					break;
				case 3:
					System.out.println("Enter New state of "+newContact.firstLastName);
					scanner.nextLine();
					newContact.state=scanner.nextLine();
					System.out.println("State updated Successfully");
					break;
				case 4:
					System.out.println("Enter New Zip of "+newContact.firstLastName);
					newContact.zip=scanner.nextLong();
					System.out.println("Zip updated Successfully");
					break;
				case 5:
					System.out.println("Enter New Phone Number of "+newContact.firstLastName);
					newContact.phoneNum=scanner.nextLong();
					System.out.println("Phone Number updated Successfully");
					break;
				case 6:
					System.out.println("Enter New Email of "+newContact.firstLastName);
					scanner.nextLine();
					newContact.email=scanner.nextLine();
					System.out.println("Email updated Successfully");
					break;
				default:
					System.out.println("You have Entered Wrong Choice.Please enter choice between 1 to 6 ");
			}
		} else {
			System.out.println("You have Entered Name which is not Present in your Address Book");
		}
	}
	public void deleteContact(String name) {
		if(name.equalsIgnoreCase(newContact.firstLastName)) {
			newContact.firstLastName=null;
			newContact.address=null;
			newContact.city=null;
			newContact.state=null;
			newContact.zip=0;
			newContact.phoneNum=0;
			newContact.email=null;
			System.out.println("Contact Deleted");
		}
	}
	public static void main(String[] args) {
		DeleteContact addressBook=new DeleteContact();
		String name;
		addressBook.addContact();
		System.out.println("Enter name of Person to edit Contact");
		name=addressBook.getString();
		addressBook.editContact(name);
		System.out.println("Enter name of Person to delete Contact");
		name=addressBook.getString();
		addressBook.deleteContact(name);
	}
}
