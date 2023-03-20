import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class ServiceImpl implements Service {
    @Override
    public Group addNewGroup(List<Group> groups) {
        Group group = new Group();
        Boolean itsTrue = true;
        while (itsTrue)
        try {
            Boolean foundGroup = true;
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n Как вы назовёте новую группу? ");
            String inputGroupName = scanner.nextLine();
            System.out.println("Описание: ");
            String description = scanner.nextLine();
            for (Group group1 : groups) {
                if (group1.getGroupName().equalsIgnoreCase(inputGroupName)) {
                } else {
                    throw new MyExc("Название группы уже существует!");
                }
            }
            int idCounter = 0;
            ++idCounter;
            group.setId(idCounter);
            group.setGroupName(inputGroupName);
            group.setDescription(description);
            groups.add(group);
            System.out.println("Группа успешно создана");
            return group;
        } catch (MyExc e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String getGroupByName(List<Group> groups) {
        boolean foundGroup = false;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название группы:");
            String name = scanner.nextLine();

            for (Group group : groups) {
                if (group.getGroupName().equalsIgnoreCase(name)) {
                    System.out.println(group);
                    foundGroup = true;
                }
                else{
                    foundGroup = false;
                }
            }
            if (foundGroup) {
                for (Group group:groups) {
                    if (group.getGroupName().equalsIgnoreCase(name)) {
//                        System.out.println(group);
                        foundGroup = false;
                    }
                    if (!foundGroup){
                        throw new CheckInfo("Такой группы не существует");
                    }
                }
            }
        } catch (CheckInfo e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean updateGroupName(List<Group> groups) {
        try {
            System.out.println("Введите старое название группы");
            String oldName = new Scanner(System.in).nextLine();
            boolean foundGroup = false;
            for (Group g : groups) {
                if (g.getGroupName().equalsIgnoreCase(oldName)) {
                    System.out.println("Введите новое название группы");
                    String newName = new Scanner(System.in).nextLine();
                    g.setGroupName(newName);
                    System.out.println(g.getGroupName());
                    foundGroup = true;
                    break;
                }
            }
            if (!foundGroup) {
                throw new CheckInfo("Группа не найден!");
            }
        } catch (CheckInfo e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public void getAllGroup(List<Group> groups) {
        for (Group g: groups) {
            System.out.println(g);
        }
        }


    @Override
    public void addNewStudentToGroup(List<Group> groups) {

    }

    @Override
    public void updateStudent(List<Group> groups) {

    }

    @Override
    public void findStudentByFirstName(List<Group> groups) {

    }

    @Override
    public void getAllStudentByGroupName(List<Group> groups) {

    }

    @Override
    public void getAllStudentsLesson(List<Group> groups) {

    }

    @Override
    public void deleteStudentFromGroup(List<GroupLayout.Group> groups) {

    }

    @Override
    public void addNewLessonToGroup(List<Group> groups) {

    }

    @Override
    public void getLessonByName(List<Group> groups) {

    }

    @Override
    public void getAllLessonByGroupName(List<Group> groups) {

    }

    @Override
    public void deleteLessonFromGroup(List<Group> groups) {

    }
}