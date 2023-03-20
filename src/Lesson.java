public class Lesson {
    private String name;
    private Group group;

    public Lesson(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return  "| Lesson: " +
                "| Name: " + name + '\'' +
                "| Group:" + group ;
    }
}
