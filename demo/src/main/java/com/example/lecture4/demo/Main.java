package com.example.lecture4.demo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class Main 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Welcome to the student management system. Please enter the details below, one by one:");

        System.out.println("How many students' entries do you want to enter:");
        int choice = input.nextInt();
        input.nextLine();                 // Once I enter a number here, the control does not move to the next line. 
                                        // choice = 2 __ 
                                        // __ 
                                    //It stays there...
                                    // ...instead of moving to the next line, and being ready to accept the next input...
                                    // So, the next time the Scanner object method like nextLine, next-whatever is called
                                    // the method will automatically accept a blank line instead of the value entered by the user
                                    // 
        String id, fName, lName, address, gender, yOfStudy;

        double physics, chemistry, biology, math, totalGrades;

        Student [] pupil = new Student[choice];

        System.out.println("\n Now you may enter the information one by one: ");

        for(int j=0; j<pupil.length; j++){
            System.out.format("Enter the ID for Student No.%d:", j+1);
            id = input.nextLine();

            System.out.format("Enter the first name for Student No.%d:", j+1);
            fName = input.nextLine();

            System.out.format("Enter the last name for Student No.%d:", j+1);
            lName = input.nextLine();

            System.out.format("Enter the address for Student No.%d:", j+1);
            address = input.nextLine();

            System.out.format("Enter the gender for Student No.%d:", j+1);
            gender = input.nextLine();

            System.out.format("Enter the year of study for Student No.%d:", j+1);
            yOfStudy = input.nextLine();

            System.out.format("Enter the Physics marks for Student No.%d:", j+1);
            physics = input.nextDouble();
            input.nextLine();

            System.out.format("Enter the Chemistry marks for Student No.%d:", j+1);
            chemistry = input.nextDouble();
            input.nextLine();

            System.out.format("Enter the Biolody marks for Student No.%d:", j+1);
            biology = input.nextDouble();
            input.nextLine();

            System.out.format("Enter the Math marks for Student No.%d:", j+1);
            math = input.nextDouble();
            input.nextLine();

            System.out.format("Now, please enter the total grades for Student No.%d:", j+1);
            totalGrades = input.nextDouble();
            input.nextLine();

            pupil[j] = new Student(id, fName, lName , address);

            pupil[j].setStudentGender(gender);
            pupil[j].setStudyYear(yOfStudy);
            pupil[j].setStudentFees(yOfStudy);
            pupil[j].setPhysicsMarks(physics);
            pupil[j].setChemistryMarks(chemistry);
            pupil[j].setBiologyMarks(biology);
            pupil[j].setMathMarks(math);
            pupil[j].setTotalGrades(totalGrades);
            pupil[j].setTotalCoursesTaken();
            pupil[j].setStudentDistinction();

        }
        
        for(int k=0; k<pupil.length; ++k){
            System.out.format("Details of Student No.%d is", k+1);
            System.out.println("\n");
            System.out.println(pupil[k]);
            System.out.println("\n");

        }

        LocalDate dayOfTheEntry = LocalDate.now(); // retrieves the current date
        LocalTime timeOfTheEntry = LocalTime.now(); // retrieves the current time

        System.out.println("\n" + "The above entry was added on " + dayOfTheEntry + " at " + timeOfTheEntry);

        input.close();
    }
}
