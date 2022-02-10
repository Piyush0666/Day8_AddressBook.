package com.bridgelabz.AddressBook.Day8;

import java.util.Scanner;
public class AddressBookUc3 extends AddressBookUc2  {
    static Scanner obj = new Scanner(System.in);
    public void editData() {
        int i,ans;
        System.out.println("\nEnter first name to edit :- ");
        String name = obj.next();
        for(i = 0 ; i < contactBook.size() ; i++) {
            if(contactBook.get(i).getFirstName().equals(name)) {
                do {
                    System.out.print("\nSelect option to edit----\n1.First_name \n2.Last_name \n3.Address \n4.City \n5.State \n6.Zip_code \n7.Phone_number \n8.Email :- ");
                    int ch = obj.nextInt();
                    switch(ch) {
                        case 1:
                            System.out.print("Enter new first name :- ");
                            contactBook.get(i).setFirstName(obj.next());
                            System.out.println("First name is updated.");
                            break;
                        case 2:
                            System.out.print("Enter new last name :- ");
                            contactBook.get(i).setLastName(obj.next());
                            System.out.println("Last name is updated.");
                            break;
                        case 3:
                            System.out.print("Enter new address :- ");
                            contactBook.get(i).setAddress(obj.next());
                            System.out.println("Address is updated.");
                            break;
                        case 4:
                            System.out.print("Enter new city :- ");
                            contactBook.get(i).setCity(obj.next());
                            System.out.println("City is updated.");
                            break;
                        case 5:
                            System.out.print("Enter new state :- ");
                            contactBook.get(i).setState(obj.next());
                            System.out.println("State is updated.");
                            break;
                        case 6:
                            System.out.print("Enter new zip code :- ");
                            contactBook.get(i).setZip(obj.nextInt());
                            System.out.println("Zip code is updated.");
                            break;
                        case 7:
                            System.out.print("Enter new phone number :- ");
                            contactBook.get(i).setPhoneNo(obj.nextLong());
                            System.out.println("Phone number is updated.");
                            break;
                        case 8:
                            System.out.print("Enter new email :- ");
                            contactBook.get(i).setEmail(obj.next());
                            System.out.println("Email is updated.");
                            break;
                    }
                    System.out.println("Enter 1 if you want to continue");
                    ans = obj.nextInt();
                }while(ans == 1);
            }
            else
                System.out.println("Please enter the correct first name");
        }

    }
    public static void main(String[] args) {
        AddressBookUc3 a = new AddressBookUc3() ;
        a.readData();
        a.DisplayContacts();
        a.editData();
        a.DisplayContacts();


    }
}