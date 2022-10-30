package university.data;

public class Student extends User{
    private Integer studentId;
    private Integer age;

    public Student(String fullName, String username, int age) {
        super(fullName, username);
        this.age = age;
        this.studentId = (int)(100000 * Math.random());
    }

    public Integer getStudentId() {
        return this.studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + this.studentId +
                ", age=" + this.age +
                ", fullName='" + super.fullName + '\'' +
                ", username='" + super.username + '\'' +
                '}';
    }
}
