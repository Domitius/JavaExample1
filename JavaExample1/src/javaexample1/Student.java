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
public class Student extends Person {
    String major;
    double gradeAvg;
    
    Student() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("What is your major?");
        major = sc.next();
        sc.nextLine();
        System.out.println("What is your grade point average?");
        gradeAvg = sc.nextDouble();
    }
    
    @Override public void display() {
        super.display();
        System.out.printf("Major: %s Grade Point Avg: %s%n", major, gradeAvg);
    }
}
