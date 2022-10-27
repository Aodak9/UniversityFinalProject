package org.university;

public class Teacher {

    private String teacherFullName;
    private double baseSalary;
    private int teacherId;

    public Teacher(String teacherFullName, double baseSalary) {
        this.teacherFullName = teacherFullName;
        this.baseSalary = baseSalary;
        this.teacherId = (int)(100000 * Math.random());
    }
}
