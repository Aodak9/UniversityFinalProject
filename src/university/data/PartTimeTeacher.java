package university.data;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class PartTimeTeacher extends Teacher{

    private final Integer hoursPerWeek;

    public PartTimeTeacher(String fullName, String username,Double baseSalary, Integer hoursPerWeek){
        super(fullName, username,baseSalary);
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calculateSalary() {
        return ((super.baseSalary / 192) * (this.hoursPerWeek));
    }

    @Override
    public String toString() {
        return "Teacher id: " + super.teacherId +
                " | Part time | -> " +
                " Name: " + super.fullName +
                " - Username: " + super.username +
                " - Base salary: " + super.baseSalary +
                " - Hours per week: " + this.hoursPerWeek +
                " - Monthly salary: " + String.format("%,.1f", calculateSalary());
    }
}
