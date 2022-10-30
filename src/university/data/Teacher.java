package university.data;

public abstract class Teacher extends User {
    protected Double baseSalary;
    protected Integer teacherId;
    protected Double totalSalary;

    public Teacher(){
    }

    public Teacher(String fullName, String userName, Double baseSalary) {
        super(fullName, userName);
        this.baseSalary = baseSalary;
        this.teacherId = (int)(100000 * Math.random());
        this.totalSalary = calculateSalary();
    }

    public abstract double calculateSalary();


}
