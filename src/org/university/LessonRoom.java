package org.university;

import java.util.ArrayList;

public class LessonRoom {
    private String lessonName;
    private int lessonRoom;
    private Teacher selectedTeacher;

    public LessonRoom(String lessonName, int lessonRoom) {
        this.lessonName = lessonName;
        this.lessonRoom = lessonRoom;
    }

    public String getLessonName() {
        return this.lessonName;
    }

    public int getLessonRoom() {
        return this.lessonRoom;
    }

    public Teacher getSelectedTeacher() {
        return this.selectedTeacher;
    }

    public void addTeacher(Teacher selectedTeacher){

    }

}
