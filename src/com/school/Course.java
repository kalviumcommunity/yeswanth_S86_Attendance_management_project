package com.school;

public class Course {
    private int courseId;
    private String courseName;
    private static int idCounter = 1;

    public Course(String courseName) {
        this.courseId = idCounter++;
        this.courseName = courseName;
    }

    // Getters
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}
