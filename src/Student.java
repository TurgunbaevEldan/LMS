public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Group group;
    private int id;

    public Student(String firstName, String lastName, String email, String password, Group group, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.group = group;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "| Student: " +
                "| FirstName: " + firstName + '\'' +
                "| LastName: " + lastName + '\'' +
                "| Email: " + email + '\'' +
                "| Password: " + password + '\'' +
                "| Group: " + group+
                "| Id: " + id;
    }
}