import java.util.ArrayList;
import java.util.Scanner;

//Main Class - From here user can add and view expenses
public class ExpenseTracker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Expense> expenses = ExpenseStorage.loadExpenses();
        Boolean uiBool = true;
        ExpenseGUI GUI = new ExpenseGUI();

        //basic UI for Expense Tracker
        while (uiBool){
            System.out.println("\nExpense Tracker - Please Select an Option:");
            System.out.println("1. Add an Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Exit Expense Tracker");
            System.out.println("Please Enter Your Choice (1, 2, 3):");
            int choice = scanner.nextInt();

            // Continuation based on entered choice.
            switch(choice){
                //add expenses
                case 1:
                    System.out.print("Please enter date of expense (MM/DD/YYYY): ");
                    String date = scanner.next();
                    scanner.nextLine();
                    System.out.print("Please enter description of expense: ");
                    String desc = scanner.nextLine();
                    System.out.print("Please enter amount: ");
                    double amt = scanner.nextDouble();
                    expenses.add(new Expense(date,desc, amt));
                    ExpenseStorage.saveExpenses(expenses);
                    break;
                //view expenses
                case 2:
                    for (Expense e : expenses) {
                        System.out.println(e);
                    }
                    break;
                //exit program
                case 3:
                    System.out.println("Goodbye!");
                    return;
                 //Default case - invalid user input.
                default:
                    System.out.println("Not a valid choice - please enter an integer representing your choice from the menu (1, 2, 3)");
            }
        }
    }
}

