import java.util.List;

public class Group {
    private String groupName;
    private int id;
    private String description;
    private String lessons;
    private List<Student> students;

    public Group(String groupName, int id, String description, String lessons, List<Student> students) {
        this.groupName = groupName;
        this.id = id;
        this.description = description;
        this.lessons = lessons;
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return  "| Group  \n" +
                "| GroupName: " + groupName + '\n' +
                "| Id: " + id + '\n' +
                "| Description: " + description + '\n' +
                "| Lessons: " + lessons + '\n' +
                "| Students: " + students + '\n';
    }
    public Group (){

    }

    public void setName(String name) {
    }

    public String getName() {
        return null;
    }
}
