package org.university;

import java.util.ArrayList;

public class University {
    ArrayList<LessonRoom> lessonRoomList = new ArrayList<LessonRoom>();
    ArrayList<Teacher> teachersList = new ArrayList<Teacher>();
    ArrayList<Student> studentsList = new ArrayList<Student>();

    public ArrayList<LessonRoom> getLessonRoomList() {
        return lessonRoomList;
    }

    public ArrayList<Teacher> getTeachersList() {
        return teachersList;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }
}
