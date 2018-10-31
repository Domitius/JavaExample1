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
                    
                    arraySizeCheck(arrayPerson, employee);
                    break;
                case 'F':
                case 'f':
                    System.out.println("You are entering data for a faculty member.");
                    Faculty faculty = new Faculty();

                    arraySizeCheck(arrayPerson, faculty);
                    break;
                case 'S':
                case 's':
                    System.out.println("You are entering data for a student.");
                    Student student = new Student();

                    arraySizeCheck(arrayPerson, student);
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
    }
    
    public static void arraySizeCheck(ArrayList<Person> arrayList, Person d) {
        if (arrayList.size() != 1) {
            arrayList.add(d);
        } else {
            System.out.println("Cannot add this item to array. Array is full");
        }
    }
}

