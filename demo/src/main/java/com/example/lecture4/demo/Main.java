package com.example.lecture4.demo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class Main 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);;

        System.out.println("Welcome to the student management system. Please enter the details below, one by one:");
        
        System.out.println("Please enter the Student ID: ");
        String id = input.nextLine();

        System.out.println("Now, please enter the Student's first name only:");
        String firstName = input.nextLine();

        System.out.println("Now, please enter the Student's last name only:");
        String lastName = input.nextLine();

        System.out.println("Now, please enter the Student's gender (Male, Female, or Other):");
        String gender = input.nextLine();

        System.out.println("Now, please enter the Student's address only:");
        String address = input.nextLine();
        
        System.out.println("Now, please enter the Student's year of study (1, 2, 3, or 4):");
        String yOfStudy = input.nextLine();

        System.out.println("Now, please enter the marks the Student scored in Physics:");
        double physics = input.nextDouble();

        System.out.println("Now, please enter the marks the Student scored in Chemistry:");
        double chemistry = input.nextDouble();

        System.out.println("Now, please enter the marks the Student scored in Biology:");
        double biology = input.nextDouble();

        System.out.println("Now, please enter the marks the Student scored in Math:");
        double math = input.nextDouble();

        System.out.println("Now, please enter the total number of course the Student has taken (in numbers only):");
        int totalCourses = input.nextInt();

        System.out.println("Now, please enter the total grades the Student has received (in numbers only):");
        double totalGrades = input.nextDouble();

        Student student1 = new Student(id, firstName, lastName, address, totalCourses); 
    
        student1.setStudentGender(gender);
        student1.setStudyYear(yOfStudy);
        student1.setStudentFees(yOfStudy);
        student1.setPhysicsMarks(physics);
        student1.setChemistryMarks(chemistry);
        student1.setBiologyMarks(biology);
        student1.setMathMarks(math);
        student1.setTotalGrades(totalGrades);
        student1.setStudentDistinction();

        System.out.println(student1); // equals to System.out.println(student1.toString()) - - CORRECT

        LocalDate dayOfTheEntry = LocalDate.now(); // retrieves the current date
        LocalTime timeOfTheEntry = LocalTime.now(); // retrieves the current time

        System.out.println("\n" + "The above entry was added on " + dayOfTheEntry + " at " + timeOfTheEntry);

        input.close();
    }
}
