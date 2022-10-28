package university.persistance;

import university.data.University;

public class InformationProvider {
    public static University universityInformationProvider(){
        University university = new University();

        loadStudentIntoUniversity(university);

        return university;

    }

    private static void loadStudentIntoUniversity(University university) {
        university.createStudent("Tom Walker", 25);
        university.createStudent("Bruno Diaz", 20);
        university.createStudent("Jordan Smith", 23);
        university.createStudent("Michael Stravinsky", 28);
        university.createStudent("Lana Clinton", 19);
        university.createStudent("Sam Jackson", 21);
    }


}
