import university.persistance.InformationProvider;
import university.data.University;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userOption = 0;

        University university = InformationProvider.universityInformationProvider();

        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("Welcome to" + university.getuName() + "university");
        System.out.println("*****************************");
        System.out.println("*****************************");

        int EXIT_OPTION = 8;

        do {
            userOption = 0;

            showOptions();

            try {
                String selectedOptionStr = scan.nextLine();
                userOption = Integer.parseInt(selectedOptionStr);
            } catch (java.lang.NumberFormatException e){
                System.out.println(tryAgainAction());
            }

            if (userOption >= 1 && userOption <= EXIT_OPTION){
                switch (userOption){
                    case 1:
                        showTeachersInfo(university);
                        break;
                    case 2:
                        showStudentsInfo(university);
                        break;
                    case 3:
                        showLessonsInfo(university);
                        break;
                    case 4:
                        findLessonByStudent(university);
                        break;
                    case 5:
                        createLessonAction(university);
                        break;
                    case 6:
                        createStudentAction(university);
                        break;
                    case 7:
                        createAddAStudentToALesson(university);
                        break;

                }
            }
            if (userOption > EXIT_OPTION){
                System.out.println(tryAgainAction());
            }

        } while (userOption != EXIT_OPTION);

    }

    private static void showOptions() {
        System.out.println( "******** Select an option: ********" );
        System.out.println( "****** 1. Show teacher`s info **********************" );
        System.out.println( "****** 2. Show student`s info **********************" );
        System.out.println( "****** 3. Show lesson`s  info **********************" );
        System.out.println( "****** 4. Find suscribed lessons, by student id ****" );
        System.out.println( "****** 5. Add a new lesson  ************************" );
        System.out.println( "****** 6. Add a new student ************************" );
        System.out.println( "****** 7. Add a student to a lesson ****************" );
        System.out.println( "****** 8. Exit menu ********************************" );
    }

    private static String errorAction(){
        return " ***** An error has occurred ***** ";
    }

    private static String returnAction(){
        return " ***** Go back to menu ***** ";
    }

    private static String tryAgainAction(){
        return " ***** You press the wrong option, please try again *****";
    }

    private static String noInfoAvailable(){
        return " ***** No information available to show ***** ";
    }

    private static void showStudentsInfo(University university){
        System.out.println(" ********** Student`s Info **********");

        if (university.getStudentListSize() == 0){
            System.out.println(noInfoAvailable());
        }

        for (int i = 0; i < university.getStudentListSize(); i++){
            System.out.println(university.getStudentByI(i));
        }

        System.out.println("********************");
        System.out.println(returnAction());
    }

    private static void showTeachersInfo(University university){
        System.out.println(" ********** Student`s Info **********\n");

        if(university.getTeacherListSize() == 0){
            System.out.println(noInfoAvailable());
        }

        for (int i = 0; i < university.getTeacherListSize(); i++){
            System.out.println(university.getTeacherByI(i));
        }

        System.out.println("********************");
        System.out.println(returnAction());
    }

    private static void showLessonsInfo(University university){
        System.out.println(" ********** Lesson`s Info **********\n");

        if(university.getLessonRoomListSize() == 0){
            System.out.println(noInfoAvailable());
        }

        for (int i = 0; i < university.getLessonRoomListSize(); i++){
            System.out.println(university.getLessonRoomByI(i));
        }

        getLessonDetail(university);
        System.out.println("********************");
        System.out.println(returnAction());
    }

    private static void getLessonDetail(University university){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** For information about a Lesson ***** ");
        System.out.println("***** Type the id below ****************** ");
        System.out.println("***** To leave the menu press 0 ********** ");
        
        try {
            int lessonId = scanner.nextInt();
            if (lessonId > 0){
                System.out.println(university.getLessonInformation(lessonId));
            }
        } catch (Exception ex){
            System.out.println(errorAction());
        }
        System.out.println("********************");
        System.out.println(returnAction());
    }

    private static void createStudentAction(University university){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ****** Creation of a new student ****** ");

        try {
            System.out.println(" Please, enter the full name");
            String fullName = scanner.nextLine().trim();

            System.out.println(" Please, enter the full user name");
            String username = scanner.nextLine().trim();

            System.out.println(" Please, enter the age of the student");
            int age = scanner.nextInt();

            System.out.println("********************");
            System.out.println(university.createStudent(fullName, username, age));
        } catch (Exception ex) {
            System.out.println(errorAction());
        }

        System.out.println("********************");
        System.out.println(returnAction());
    }

    private static void createAddAStudentToALesson(University university){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ****** Add student to a Lesson Here!! ****** ");

        try {
            System.out.println("Please, enter the lesson id: ");
            int lessonId = scanner.nextInt();

            System.out.println("Please, enter the student id: ");
            int studentId = scanner.nextInt();

            System.out.println("********************");
            System.out.println(university.createLessonStudentById(lessonId, studentId));
        } catch (Exception ex){
            System.out.println(errorAction());
        }

        System.out.println("********************");
        System.out.println(returnAction());
    }

    private static void createLessonAction(University university){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ****** create a new Lesson Here!! ****** ");

        try {
            System.out.println("Please, enter the lesson name: ");
            String lessonName = scanner.nextLine().trim();

            System.out.println("Please, enter the teacher id for this lesson: ");
            int teacherId = scanner.nextInt();

            System.out.println("********************");
            System.out.println(university.createLesson(lessonName, teacherId));
        } catch (Exception ex){
            System.out.println(errorAction());
        }

        System.out.println("********************");
        System.out.println(returnAction());
    }

    private static void findLessonByStudent(University university){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ****** find the lessons where the student is suscribed!! ****** ");

        try {
            System.out.println("Please, enter the student id: ");
            int studentId = scanner.nextInt();

            System.out.println(university.getStudentSuscribedLessons(studentId));

        } catch (Exception ex){
            System.out.println(errorAction());
        }

        System.out.println("********************");
        System.out.println(returnAction());
    }
}


