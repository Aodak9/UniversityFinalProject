package university.data;

public abstract class Teacher {

    private String teacherFullName;
    protected double baseSalary;
    private int teacherId;

    public double totalSalary;

    public Teacher(String teacherFullName, double baseSalary) {
        this.teacherFullName = teacherFullName;
        this.baseSalary = baseSalary;
        this.teacherId = (int)(100000 * Math.random());
        this.totalSalary = calculateSalary();
    }

    public abstract double calculateSalary();


}
