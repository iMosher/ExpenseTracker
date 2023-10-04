import java.io.*;
import java.util.ArrayList;

public class ExpenseStorage {
    private static final String FILENAME = "expenses.txt";

    //Save Expenses to a txt file
    public static void saveExpenses(ArrayList<Expense> expenses){
        try (PrintWriter w = new PrintWriter(new FileWriter(FILENAME))) {
            for (Expense e : expenses) {
                w.println(e.getDate() + "," + e.getDescription() + "," + e.getAmount());
            }
        } catch (IOException e) {
            System.out.println("Error saving expense" + e.getMessage());
        }
    }

    public static ArrayList<Expense> loadExpenses() {
        ArrayList<Expense> exps = new ArrayList<>();

        try (BufferedReader r = new BufferedReader(new FileReader(FILENAME))){
            String ln;
            while ((ln = r.readLine()) != null) {
                String[] individual = ln.split("'");
                exps.add(new Expense(individual[0], individual[1], Double.parseDouble(individual[2])));
            }
        } catch (IOException e){
            System.out.println("Error reading expenses from text file" + e.getMessage());
        }
        return exps;
    }
}
