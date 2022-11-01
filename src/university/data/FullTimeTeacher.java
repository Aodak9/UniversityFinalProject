package university.data;

import java.util.ArrayList;
import java.util.List;

public class FullTimeTeacher extends Teacher{
    private Integer yearsOfExperience;

    public FullTimeTeacher(){
    }

    public FullTimeTeacher(String fullName, String username, Double baseSalary, Integer years){
        super(fullName, username, baseSalary);
        this.yearsOfExperience = years;
    }

    @Override
    public double calculateSalary() {
        return (super.baseSalary * (this.yearsOfExperience * 110/100));
    }

    @Override
    public String toString(){
        return "Teacher id: " + super.teacherId +
                " | Full time | -> " +
                "Name: " + super.fullName +
                " -Username: " + super.username +
                " -Base salary: " + super.baseSalary +
                " -Years of experience: " + this.yearsOfExperience +
                " - Monthly salary: " + String.format("%,.1f",calculateSalary());
    }
}
