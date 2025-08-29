package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create sample students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        // Create sample courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");

        // Attendance log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Valid entries
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getStudentId(), c2.getCourseId(), "Absent"));

        // Invalid entry
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c2.getCourseId(), "Late"));

        // Display
        System.out.println("\nAttendance Log:");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
