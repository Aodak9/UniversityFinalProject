package university.data;

public class User {

    protected String fullName;

    protected String username;

    public User(){
    }

    public User(String fullName, String username) {
        this.fullName = fullName;
        this.username = username;
    }


    public String getUsername() {
        return this.username;
    }
}
