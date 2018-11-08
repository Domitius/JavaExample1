/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample1;
import java.util.Scanner;
/**
 *
 * @author gavinburris
 */
public class Person {
    protected String firstName;
    protected String lastName;
    protected String streetAddress;
    protected int zipCode;
    protected String phoneNum;
    
    Person() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name?");
        this.firstName = sc.nextLine();
        System.out.println("What is your last name?");
        this.lastName = sc.nextLine();
        System.out.println("What is your street address?");
        this.streetAddress = sc.nextLine();
        System.out.println("What is your zip code?");
        this.zipCode = sc.nextInt();
        System.out.println("What is your phone number?");
        this.phoneNum = sc.next();
    }
    
    protected void display() {
        System.out.printf("Name: %s %s Address: %s, %s Phone Number: %s", firstName, lastName, streetAddress, zipCode, phoneNum);
    }
}
