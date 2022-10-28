package university.data;

import java.util.ArrayList;
import java.util.List;

public class PartTimeTeacher extends Teacher{
    private List<PartTimeTeacher> partTimeTeacherList;
    private int hoursPerWeek;

    public PartTimeTeacher(String teacherFullName, double baseSalary, int hours){
        super(teacherFullName, baseSalary);
        this.partTimeTeacherList = new ArrayList<>();
        this.hoursPerWeek = hours;
    }

    @Override
    public double calculateSalary() {
        double salary = baseSalary * hoursPerWeek;
        return salary;
    }
}
