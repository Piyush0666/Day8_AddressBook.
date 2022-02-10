package com.bridgelabz.AddressBook.Day8;


import java.util.Scanner;
import java.util.ArrayList;;
public class AddressBookUc2 {
    private String first;
    private String last;
    private String add;
    private String city;
    private String state;
    private int zip;
    private long phoneNo;
    private String email;
    static ArrayList<AddressBookUc1> contactBook = new ArrayList<>();
    public void readData() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first name : ");
        first = obj.next();
        System.out.println("Enter the last name : ");
        last = obj.next();
        System.out.println("Enter the address : ");
        add = obj.next();
        System.out.println("Enter the city : ");
        city = obj.next();
        System.out.println("Enter the state : ");
        state = obj.next();
        System.out.println("Enter the zip code : ");
        zip = obj.nextInt();
        System.out.println("Enter the phone number : ");
        phoneNo = obj.nextLong();
        System.out.println("Enter the email : ");
        email = obj.next();
        AddressBookUc1 contact = new AddressBookUc1(first , last , add , city , state , zip , phoneNo , email);
        contactBook.add(contact);
        System.out.println("\nContact added Successfully.");
    }

    public void DisplayContacts() {
        int i;
        System.out.println("\nContacts Present in Address Book:");
        for(i = 0 ; i < contactBook.size() ; i++) {
            System.out.println(contactBook.get(i));
        }
    }

    public static void main(String[] args) {
        AddressBookUc2 a = new AddressBookUc2();
        a.readData();
        a.DisplayContacts();
    }
}