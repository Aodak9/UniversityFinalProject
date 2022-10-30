package university.data;

import java.util.ArrayList;
import java.util.List;

public class LessonRoom {
    private String lessonName;
    private String lessonRoom;

    private static Integer count = 0;

    private Integer LessonId;

    private List<Student> lessonStudentList;
    private Teacher selectedTeacher;

    public LessonRoom(){
    }

    public LessonRoom(String lessonName, Teacher selectedTeacher) {
        this.lessonName = lessonName;
        this.lessonRoom = "C·" + count;
        this.LessonId = 1000 + (++count);
        this.selectedTeacher = selectedTeacher;
        this.lessonStudentList = new ArrayList<>();
    }

    public String getLessonName() {
        return this.lessonName;
    }

    public Integer getLessonId() {
        return this.LessonId;
    }

    public String getTeacherUser(){
        return this.selectedTeacher.getUsername();
    }

    public String getLessonStudents() {
        String lessonStudents = "";

        if (this.lessonStudentList.size() == 0) {
            lessonStudents = "There´s no students in " + this.lessonName;
        }

        for (Student student : this.lessonStudentList) {
            lessonStudents += "Username: " + student.getUsername() + " Id: " + student.getStudentId();
        }

        return lessonStudents;
    }

    public boolean studentInLesson(Student student){
        return this.lessonStudentList.contains(student);
    }

    public String addLessonStudent(Student student){
        String studentAdded = "Student: " + student.getStudentId() + " already subscribed in " + this.lessonName + "lesson";

        if(!this.lessonStudentList.contains(student)) {
            this.lessonStudentList.add(student);
            studentAdded = "Student: " + student.getStudentId() + "is now subscribed to" + this.lessonName;
        }

        return studentAdded;

    }

    @Override
    public String toString() {
        return "LessonRoom: " + this.lessonRoom + "LessonId: " + this.LessonId + "LessonName: " + this.lessonName;
    }
}
