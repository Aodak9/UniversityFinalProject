package university.data;

import java.util.ArrayList;

public class University {


    private final ArrayList<LessonRoom> lessonRoomList = new ArrayList<LessonRoom>();
    private final ArrayList<Teacher> teachersList = new ArrayList<Teacher>();
    private final ArrayList<Student> studentsList = new ArrayList<Student>();

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
