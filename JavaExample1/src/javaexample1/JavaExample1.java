/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author gavinburris
*/
public class JavaExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean choice = true;
        char dataChoice;
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> arrayPerson = new ArrayList<>(14);
        
        
        while (choice) {
            System.out.println("What kind of data are you entering? (C, F, S) Q for quit");
            dataChoice = sc.next().charAt(0);
            
            switch (dataChoice) {
                case 'C':
                case 'c':
                    System.out.println("You are entering data for a college employee.");
                    CollegeEmployee employee = new CollegeEmployee();
                    
                    arrayPerson.add(employee);
                    break;
                case 'F':
                case 'f':
                    System.out.println("You are entering data for a faculty member.");
                    Faculty faculty = new Faculty();

                    arrayPerson.add(faculty);
                    break;
                case 'S':
                case 's':
                    System.out.println("You are entering data for a student.");
                    Student student = new Student();

                    arrayPerson.add(student);
                    break;
                case 'Q':
                case 'q':
                    choice = false;
                    break;
                default:
                    System.out.println("Please pick one of the choices");
                    break;
            }
        }
        // Not sure how to clear the console so, I will add some line breaks to clean up a bit.
        System.out.printf("%n%n%n%n");
        
        System.out.println("\033[1mCollege Employees\033[0m");
        for (int i = 0; i < arrayPerson.size(); i++) {
            if (arrayPerson.get(i) instanceof CollegeEmployee && !(arrayPerson.get(i) instanceof Faculty)) {
                arrayPerson.get(i).display();
                System.out.printf("%n");
            } 
        }
        
        System.out.println("\033[1mFaculty\033[0m");
        for (int i = 0; i < arrayPerson.size(); i++) {
            if (arrayPerson.get(i) instanceof Faculty) {
                arrayPerson.get(i).display();
            } 
        }
        
        System.out.println("\033[1mStudents\033[0m");
        for (int i = 0; i < arrayPerson.size(); i++) {
            if (arrayPerson.get(i) instanceof Student) {
                arrayPerson.get(i).display();
            } 
        }
        
        
        
        
        
        
    }
}

