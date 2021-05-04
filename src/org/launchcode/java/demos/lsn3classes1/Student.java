package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.sql.SQLOutput;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

//    public Student(String name, int studentId) {
//        this(name, studentId, 0, 0);
//    }

    public String getName() { return name; }
    private void setName(String aName) { name = aName; }

    public int getStudentId() { return studentId; }
    private void setStudentId(int aStudentId) { studentId = aStudentId; }

    public int getNumberOfCredits() { return numberOfCredits; }
    private void setNumberOfCredits(int aNumberOfCredits) { numberOfCredits = aNumberOfCredits; }

    public double getGpa() { return gpa; }
    private void setGpa( double aGpa) { gpa = aGpa; }

}