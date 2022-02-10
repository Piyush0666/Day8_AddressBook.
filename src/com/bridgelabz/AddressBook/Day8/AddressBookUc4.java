package com.bridgelabz.AddressBook.Day8;

import java.util.Scanner;
public class AddressBookUc4 extends AddressBookUc2{
    static Scanner obj = new Scanner(System.in);

    public void deleteData() {
        int i;
        System.out.println("\nEnter first name to delete : ");
        String name = obj.next();
        for (i = 0; i < contactBook.size(); i++) {
            if (contactBook.get(i).getFirstName().equals(name)) {
                contactBook.removeAll(contactBook);
                System.out.println("deleted");
            } else
                System.out.println("not deleted");
        }
    }

    public static void main(String[] args) {
        AddressBookUc3 a = new AddressBookUc3();
        AddressBookUc4 b = new AddressBookUc4();
        a.readData();
        a.DisplayContacts();
        a.editData();
        b.DisplayContacts();
        b.deleteData();
    }
}