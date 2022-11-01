package university.data;

public abstract class Teacher extends User {
    protected Double baseSalary;
    protected Integer teacherId;

    private static Integer teacherIdCount = 300;

    public Teacher(){
    }

    public Teacher(String fullName, String userName, Double baseSalary) {
        super(fullName, userName);
        this.baseSalary = baseSalary;
        this.teacherId = ++teacherIdCount;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public abstract double calculateSalary();


}
