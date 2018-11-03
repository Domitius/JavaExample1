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
public class Faculty extends CollegeEmployee {
    boolean tenured;
    
    Faculty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you Tenured? Y/N");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("Y")) {
            tenured = true;
        } else {
            tenured = false;
        }
    }

    @Override public void display() {
        super.display();
        System.out.printf(" Tenured: %s%n", tenured);
    }
}
