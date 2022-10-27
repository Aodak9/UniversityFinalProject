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
        return lessonName;
    }

    public int getLessonRoom() {
        return lessonRoom;
    }

    public Teacher getSelectedTeacher() {
        return selectedTeacher;
    }


}
