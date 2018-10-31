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
public class CollegeEmployee extends Person {
    int social;
    int salary;
    String dep;
    
    CollegeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your social security number?");
        this.social = sc.nextInt();
        System.out.println("What is your salary?");
        this.salary = sc.nextInt();
        System.out.println("What is your department?");
        this.dep = sc.next();
    }
    
    @Override public void display() {
        super.display();
        System.out.printf(" Social: %s Salary: %s Department: %s", social, salary, dep);
    }
}

