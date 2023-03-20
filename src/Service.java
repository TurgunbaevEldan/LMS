import javax.swing.*;
import java.util.List;

public interface Service {
        /*** Бир команда танданыз! ***
         1  -> Add new group
         2  -> Get group by name
         3  -> Update group name
         4  -> Get all groups
         5  -> Add new student to group
         6  -> Update student
         7  -> Find student by first name
         8  -> Get all students by group name
         9  -> Get all student's lesson
         10 -> Delete student from group
         11 -> Add new lesson to group
         12 -> Get lesson by name
         13 -> Get all lesson by group name
         14 -> Delete lesson from group
         15 -> Delete group
         * @return***/
        Group addNewGroup (List<Group> groups);
        String getGroupByName(List<Group>groups);
        boolean updateGroupName (List<Group>groups);
        void getAllGroup (List<Group>groups);
        void addNewStudentToGroup(List<Group>groups);
        void updateStudent(List<Group>groups);
        void findStudentByFirstName(List<Group>groups);
        void getAllStudentByGroupName(List<Group>groups);
        void getAllStudentsLesson(List<Group>groups);
        void deleteStudentFromGroup(List<GroupLayout.Group>groups);
        void addNewLessonToGroup(List<Group>groups);
        void getLessonByName(List<Group>groups);
        void getAllLessonByGroupName(List<Group>groups);
        void deleteLessonFromGroup(List<Group>groups);
    }


