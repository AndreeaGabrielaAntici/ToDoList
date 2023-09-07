import java.util.Scanner;
import java.TextIO

public class TodoFeatures {
    private String userName;
    private String todoList;
    private boolean continueInApp;

    Scanner input = new Scanner(System.in);

    public void setUserName(String userName) {
        userName = input.next();
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setToDoList(String todoList) {
        input.useDelimiter("\\t");
        while (true) {
            todoList = input.next();
            break;
        }
    }

    public void continueInApp(boolean YesOrNo) {
        this.continueInApp = YesOrNo;
    }

    public boolean continueInApp() {
        return this.continueInApp;
    }

    public void createTxtFileForTodos() {
        TextIO.writeFile("ToDo.txt");
        TextIO.putln(this.todoList);
    }
}