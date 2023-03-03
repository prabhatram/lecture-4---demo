package com.example.lecture4.demo;

public class Student {

    private String studentID;
    private String studentFirstName;
    private String studentLastName;
    private String studentAddress;
    private int totalCoursesTaken;
    private double totalGrades;
    private double studentFees;

    private double physicsMarks;
    private double chemistryMarks;
    private double biologyMarks;
    private double mathMarks;

    public int positiveCounter;
    public int negativeCounter;
    public int eightyCounter;
    public int ninetyCounter;

    private String studentDistinction;

    private static final String SCHOOL_NAME = "St. Agnes School";

    private enum StudyYearOptions{
        FIRST, SECOND, THIRD, FOURTH;
    }

    private enum GenderOptions{
        MALE, FEMALE, OTHER;
    }

    private GenderOptions studentGender;
    private StudyYearOptions studyYear;

    public Student(String studentID, String firstName, String lastName, String address, int totalCourses) {
        this.studentID = studentID;
        studentFirstName = firstName;
        studentLastName = lastName;
        studentAddress = address;
        totalCoursesTaken = totalCourses;
    }

    public void setStudentGender(String gender){
        switch(gender){
            case "Male":
            this.studentGender = GenderOptions.MALE;
            break;
            case "Female":
            this.studentGender = GenderOptions.FEMALE;
            break;
            case "Other":
            this.studentGender = GenderOptions.OTHER;
            break;
            default:
            System.out.println("No gender information available for this student");
        }
    }

    public void setStudyYear(String year){
        switch(year){
            case "1":
            this.studyYear = StudyYearOptions.FIRST;
            break;
            case "2":
            this.studyYear = StudyYearOptions.SECOND;
            break;
            case "3":
            this.studyYear = StudyYearOptions.THIRD;
            break;
            case "4":
            this.studyYear = StudyYearOptions.FOURTH;
            break;
            default:
            System.out.println("No study year information available for this student");
        }
    }

    public void setPhysicsMarks(double marks){
        physicsMarks = marks;
        setCounters(marks);
    }

    public void setChemistryMarks(double marks){
        chemistryMarks = marks;
        setCounters(marks);
    }

    public void setBiologyMarks(double marks){
        biologyMarks = marks;
        setCounters(marks);
    }

    public void setMathMarks(double marks){
        mathMarks = marks;
        setCounters(marks);
    }

    private void setCounters(double marks){
        if(marks < 40){
            this.negativeCounter += 1;
        }
        else if (marks < 90 && marks > 80){
            this.eightyCounter +=1;
        }
        else if (marks > 90){
            this.ninetyCounter +=1;
        }
        else {
            this.positiveCounter +=1;
        }
    }

    public void setStudentFees(String year){
        switch(year){
            case "1":
            this.studentFees = 2500;
            break;
            case "2":
            this.studentFees = 3000;
            break;
            case "3":
            this.studentFees = 3500;
            break;
            case "4":
            this.studentFees = 4000;
            break;
            default:
            this.studentFees = 0;
        }
    }
   
    public void setTotalGrades(double grades) {
        if (negativeCounter == 1){
            
            if (eightyCounter == 3){

                if ((grades + 1) > 4){
                    totalGrades = 4;
                } else {
                    totalGrades = grades + 1;
                }
            }
            else {
                totalGrades = grades;
            } 
        }
        else if (negativeCounter == 2){

            if (ninetyCounter == 2){

                if ((grades + 0.5) > 3){
                    totalGrades = 3;            
                } else {
                    totalGrades = grades + 0.5;
                }
            } 
            else {
                totalGrades = grades;
            }
        }
        else if (negativeCounter == 4){
            totalGrades = 0;
        }
        else {
            totalGrades = grades;
        }
    }

    public void setStudentDistinction(){
        if(totalGrades == 0){
            studentDistinction = "will FAIL";
        }
        else if(totalGrades > 4){
            studentDistinction = "will PASS with distinction";
        }
        else {
            studentDistinction = "will PASS without distinction";
        }
    }

    public String toString() {

        return "This " + studentGender + " " + studyYear + " year student " + studentFirstName + " " + studentLastName + " with student ID " + studentID + " lives in/at " + 
        studentAddress + ", attends " + SCHOOL_NAME + 
        " and pays a total fee of €" + studentFees + "\n" + "\n" +
        "This student scored " + "\n" + 
        physicsMarks + " in Physics, " + "\n" +
        chemistryMarks + " in Chemistry," + "\n" +
        biologyMarks + " in Biology, and " + "\n" +
        mathMarks + " in Math." + "\n" + "\n" +
        "His total grade is " + totalGrades + " from a total of " + totalCoursesTaken + " courses." + "\n" + "\n" +
        "Therefore, the student " + studentDistinction + ".";
    }

}
