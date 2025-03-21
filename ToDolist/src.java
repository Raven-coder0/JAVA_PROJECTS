package ToDoList;

import java.util.*;

public class ToDoList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> todolist = new ArrayList<>();
        Random random = new Random();
        while (true) {
            System.out.println("1. add task ");
            System.out.println("2. view tasks");
            System.out.println("3. exit");
            System.out.println("Enter your choice: ");

            int options = sc.nextInt();
            sc.nextLine();

            switch(options){
                case 1:
                    addtask(sc,todolist);
                    break;
                case 2:
                    viewtasks(todolist);
                    break;
                case 3:
                    System.out.println("Exiting the Program. GOODBYE!!!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice. Enter the valid option");
                        

            }
        }
    }
    private static void addtask(Scanner sc,  ArrayList<String> todolist){
        System.out.println("enter the task ");
        todolist.add(sc.nextLine());
        System.out.println("Task Added!!\n");
    }

    private static void viewtasks (ArrayList<String> todolist) {
        if (todolist.isEmpty()){
            System.out.println("the To-Do-List is Empty !!");
        }
        else 
        {
            System.out.println("To-Do-List : \n"+ String.join(".\n",todolist)+".\n");
        }
    }

    
}
