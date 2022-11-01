package university.persistance;

import university.data.University;

public class InformationProvider {
    public static University universityInformationProvider(){
        University university = new University("Globant");

        provideStudentInfoIntoUniversity(university);
        provideTeacherInfoIntoUniversity(university);
        provideLessonsInfoIntoUniversity(university);
        provideStudentsInfoIntoLesson(university);


        return university;

    }

    private static void provideStudentInfoIntoUniversity(University university) {
        university.createStudent("Tom Walker", "Towal.T", 25);
        university.createStudent("Bruno Diaz", "Diaz.B",20);
        university.createStudent("Jordan Smith", "J.smith",23);
        university.createStudent("Michael Stravinsky", "Stravin.M",28);
        university.createStudent("Lana Clinton", "Clin.L",19);
        university.createStudent("Sam Jackson", "Sackson.J",21);
    }

    private static void provideTeacherInfoIntoUniversity(University university){
        university.createTeacher("Jack Sims", "Jacky.S", 1000.0, 48, 2);
        university.createTeacher("Susy Grass", "Susy.G", 1000.0, 28, 2);
        university.createTeacher("Anger Adams", "Ang.A", 1000.0, 20, 1);
        university.createTeacher("James Bong", "JB.Bong", 1000.0, 12, 1);
    }

    private static void provideLessonsInfoIntoUniversity(University university){
        university.createLesson("Python", 301);
        university.createLesson("C++", 304);
        university.createLesson("Javascript", 303);
        university.createLesson("React", 302);
    }

    private static void provideStudentsInfoIntoLesson(University university){
        university.createLessonStudentById(1001, 401);
        university.createLessonStudentById(1001, 402);
        university.createLessonStudentById(1001, 403);

        university.createLessonStudentById(1002, 401);
        university.createLessonStudentById(1002, 402);
        university.createLessonStudentById(1002, 403);

        university.createLessonStudentById(1003, 404);
        university.createLessonStudentById(1003, 405);
        university.createLessonStudentById(1003, 406);

        university.createLessonStudentById(1004, 404);
        university.createLessonStudentById(1004, 405);
        university.createLessonStudentById(1004, 406);
    }

}
