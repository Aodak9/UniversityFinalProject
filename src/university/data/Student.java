package university.data;

public class Student extends User{
    private Integer studentId;
    private Integer age;

    private static Integer studentIdCount = 400;

    public Student(){
    }

    public Student(String fullName, String username, int age) {
        super(fullName, username);
        this.age = age;
        this.studentId = ++studentIdCount;
    }

    public Integer getStudentId() {
        return this.studentId;
    }

    @Override
    public String toString() {
        return "Student Id: " + this.studentId + ". - Name: " + super.fullName + " - Username: " + super.username + " - Age: " + this.age;
    }
}
