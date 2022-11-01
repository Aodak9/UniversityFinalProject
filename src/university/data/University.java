package university.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class University {

    private final String uName;
    private final List<LessonRoom> lessonRoomList;
    private final List<Teacher> teachersList;
    private final List<Student> studentsList;

    private final List<User> userList;

    public String getuName(){
        return this.uName;
    }

    public University(String uName){
        this.uName = uName;

        this.studentsList = new ArrayList<>();
        this.userList = new ArrayList<>();
        this.teachersList = new ArrayList<>();
        this.lessonRoomList = new ArrayList<>();
    }

    public Student getStudentById(int studentId){
        List<Student> studentList = this.studentsList.stream().filter(student -> studentId == student.getStudentId()).collect(Collectors.toList());

        if(studentList.size() == 0) {
            return new Student();
        } else {
            return studentList.get(0);
        }
    }

    public Teacher getTeacherById(int teacherId){
        List<Teacher> teacherList = this.teachersList.stream().filter(teacher -> teacherId == teacher.getTeacherId()).collect(Collectors.toList());

        if (teacherList.size() == 0){
            return new FullTimeTeacher();
        } else {
            return teacherList.get(0);
        }
    }

    public LessonRoom getLessonRoomById(int lessonId) {
        List<LessonRoom> lessonList = this.lessonRoomList.stream().filter(lessonRoom -> lessonId == lessonRoom.getLessonId()).collect(Collectors.toList());

        if (lessonRoomList.size() == 0) {
            return new LessonRoom();
        } else {
            return lessonList.get(0);
        }
    }

    public void createUser(User user){
        this.userList.add(user);
    }

    public String createStudent(String fullName, String username, Integer age){
        String addStudentUser = "This user already exists.";

        if(userExists(username)){
           Student createNewStudent = new Student(fullName, username, age);
           this.studentsList.add(new Student());
           createUser(createNewStudent);
           addStudentUser = "Student: " + fullName + "added";
        }

        return addStudentUser;
    }

    public String createLesson(String lessonName, int teacherId){
        String addLesson = "This Lesson is already in the system or the typed id is wrong.";

        Teacher teacher = getTeacherById(teacherId);

        if(lessonExists(lessonName) && teacher.getTeacherId() != null){
            LessonRoom createNewLesson = new LessonRoom(lessonName, teacher);
            this.lessonRoomList.add(createNewLesson);
            addLesson = "Lesson: " + lessonName + "added";
        }

        return addLesson;
    }

    public String createTeacher(String fullName, String username, Double baseSalary, Integer yearsOfExperienceOrHoursActive, int teacherType){
        String addTeacherUser = "This user already exists.";

        if(userExists(username)){
            Teacher createTeacher;
            switch (teacherType){
                case 1:
                    createTeacher = new FullTimeTeacher(fullName, username, baseSalary, yearsOfExperienceOrHoursActive);
                    this.teachersList.add(createTeacher);
                    createUser(createTeacher);
                    addTeacherUser = "Teacher: " + fullName + "is now a new full time teacher";
                    break;
                case 2:
                    createTeacher = new PartTimeTeacher(fullName, username, baseSalary, yearsOfExperienceOrHoursActive);
                    this.teachersList.add(createTeacher);
                    createUser(createTeacher);
                    addTeacherUser = "Teacher: " + fullName + "is now a new full time teacher";
                    break;
                default:
                    addTeacherUser = "follow the right options to create a new teacher";
                    break;
            }
        }
        return addTeacherUser;
    }
    public boolean userExists(String username){
        List<User> memberList = this.userList.stream().filter(user -> username.equalsIgnoreCase(user.getUsername())).collect(Collectors.toList());

        return memberList.size() == 0;
    }

    public boolean lessonExists(String lessonName){
        List<LessonRoom> lessonList = this.lessonRoomList.stream().filter(lessonRoom -> lessonName.equalsIgnoreCase(lessonRoom.getLessonName())).collect(Collectors.toList());

        return lessonList.size() == 0;
    }

    public String getLessonInformation(int lessonId){
        LessonRoom lessonRoom = getLessonRoomById(lessonId);
        String lessonsInfo = "Lesson´s id not found";
        if (lessonRoom.getLessonId() != null){
            String teacherUserName = lessonRoom.getTeacherUser();
            String lessonStudents = lessonRoom.getLessonStudents();
            lessonsInfo = "Lesson teacher: " + teacherUserName + "\n" + "Lesson students: " + lessonStudents;
        }
        return lessonsInfo;
    }

    public String getStudentsSuscribedToLessonsList(Student student){
        String lessonsByStudent = "";

        List<LessonRoom> lessonList = this.lessonRoomList.stream().filter(lessonRoom -> lessonRoom.studentInLesson(student)).collect(Collectors.toList());;
        for (LessonRoom lessonRoom: lessonList){
            lessonsByStudent += "·" + lessonRoom.getLessonName();
        }
        return lessonsByStudent;
    }

    public String getStudentSuscribedLessons(int studentId){
        Student student = getStudentById(studentId);
        String lessonsByStudentId = "id not found";
        if(student.getStudentId() != null){
            lessonsByStudentId = getStudentsSuscribedToLessonsList(student);

            if (lessonsByStudentId.length() == 0){
                lessonsByStudentId = "No lesson´s suscribed for user: " + student.getUsername();
            } else {
                lessonsByStudentId = "Lesson´s suscribed to: " + lessonsByStudentId + "with user: " + student.getUsername();
            }
        }

        return lessonsByStudentId;
    }

    public String createLessonStudentById(int lessonId, int studentId){
        LessonRoom lessonRoom = getLessonRoomById(lessonId);
        Student student = getStudentById(studentId);
        if (lessonRoom.getLessonName() != null && student.getStudentId() != null){
            return lessonRoom.addLessonStudent(student);
        } else {
            return "Please verify the lesson id or the student id";
        }
    }

    public int getTeacherListSize(){
        return this.teachersList.size();
    }

    public int getLessonRoomListSize(){
        return this.lessonRoomList.size();
    }

    public int getStudentListSize(){
        return this.studentsList.size();
    }

    public Teacher getTeacherByI(int i){
        return this.teachersList.get(i);
    }

    public LessonRoom getLessonRoomByI(int i){
        return this.lessonRoomList.get(i);
    }

    public Student getStudentByI(int i){
        return this.studentsList.get(i);
    }

}
