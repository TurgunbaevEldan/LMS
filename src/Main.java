import java.nio.file.attribute.GroupPrincipal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minutes = now.getMinute();
        int second = now.getSecond();
        if (hour > 18) {
            System.out.print("    Добрый вечер! ");
        } else if (hour > 12) {
            System.out.print("    Добрый день! ");
        } else {
            System.out.print("    Доброе утро! ");
        }
        System.out.print("         Нынешнее время: " + hour + ":" + minutes + ":" + second);
        while (true) {



                method();

        }
    }

    public static void method() {
        List<Group> groups = new ArrayList<>();
        ServiceImpl service = new ServiceImpl();
        Scanner scanner = new Scanner(System.in);
        while (true) {


            System.out.println(
                    """
                            \n     <|1|> -> Add new group                  <|2|> -> Get group by name   
                                   <|3|> -> Update group name              <|4|> -> Get all groups
                                   <|5|> -> Add new student to group       <|6|> -> Update student
                                   <|7|> -> Find student by first name     <|8|> -> Get all students by group name
                                   <|9|> -> Get all student's lesson       <|10|> -> Delete student  
                                   <|11|> -> Add new lesson to group       <|12|> -> Get lesson by name         
                                   <|13|> -> Get all lesson by group name  <|14|> -> Delete lesson     
                                                     <|15|> -> Delete group""");
            System.out.println("Выберите нужную команду:");
            int a = scanner.nextInt();
            switch (a) {
                case 1 -> System.out.println(service.addNewGroup(groups));
                case 2 -> System.out.println(service.getGroupByName(groups));
                case 3 -> System.out.println(service.updateGroupName(groups));
                case 4 -> service.getAllGroup(groups);
            }
        }
    }
}