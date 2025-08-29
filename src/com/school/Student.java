package com.school;

public class Student {
    private int studentId;
    private String name;
    private static int idCounter = 1;

    public Student(String name) {
        this.studentId = idCounter++;
        this.name = name;
    }

    // Getters (Encapsulation)
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}
