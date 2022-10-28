import org.persistance.InformationProvider;
import org.university.Student;
import org.university.University;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userOption = 0;

        University university = InformationProvider.universityInformationProvider();

        System.out.println("Welcome to Globant University");

        while(userOption != 5){
            System.out.println("Menu options");
            System.out.println("1. Full university teacher´s list");
            userOption = scan.nextInt();
            if(userOption == 1) {
                System.out.println("Teacher´s List: ");
            }

        }


    }
}
