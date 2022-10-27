package org.university;

public class Student {

    private String studentFullName;
    private int studentId;
    private int age;

    public Student(String studentFullName, int age) {
        this.studentFullName = studentFullName;
        this.age = age;
        this.studentId = (int)(100000 * Math.random());
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public int getId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }


}
