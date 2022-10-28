package university.data;

import java.util.ArrayList;
import java.util.List;

public class FullTimeTeacher extends Teacher{
    private int yearsOfExperience;

    private List<FullTimeTeacher> fullTimeTeacherList;

    public FullTimeTeacher(String teacherFullName, double baseSalary, int years){
        super(teacherFullName, baseSalary);
        this.fullTimeTeacherList = new ArrayList<>();
        this.yearsOfExperience = years;
    }

    @Override
    public double calculateSalary() {
        double salary = baseSalary * (yearsOfExperience + 110/100);
        return salary;
    }
}
