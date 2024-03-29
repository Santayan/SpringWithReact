package com.santayan.SpringWithReact.Student;

import java.util.UUID;

public class Student {

    private final UUID studentID;
    private final String firstName;
    private final String lastName;
    private final Gender gender;

    public Student(UUID studentID, String firstName, String lastName, Gender gender) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public UUID getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    enum Gender{
        MALE, FEMALE
    }



}
