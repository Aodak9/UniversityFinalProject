import university.data.Student;
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
        System.out.println("Welcome to Globant University");
        System.out.println("*****************************");
        System.out.println("*****************************");

        while(userOption != 5){
            System.out.println("************");
            System.out.println("Menu options");
            System.out.println("************");
            System.out.println("1. Full university students list");
            userOption = scan.nextInt();
            if(userOption == 1) {
                System.out.println("Students List: ");
                university.getStudentsList().toString();
            }

        }


    }
}
