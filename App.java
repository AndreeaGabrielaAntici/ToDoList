import textio.TextIO;

public class App {
    public static void main(String[] args) throws Exception {
        Todointerface userInterface = new TodoInterface();
        boolean continueInApp;

        do{
            userInterface.todo();
            System.out.println("Do you want to continue?(Type Yes or No)");
            continueInApp = TextIO.getlnBoolean();
        }while(continueInApp)
    }
}
