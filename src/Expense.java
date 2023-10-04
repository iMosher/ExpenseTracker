public class Expense {
    private String date;
    private String description;
    private double amount;

    public Expense(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }
    public String getDate(){
        return date;
    }
    public String getDescription() {
        return description;
    }
    public Double getAmount() {
        return amount;
    }

    //Not sure that I need setter methods, but including for the time being.

    public void setDate(String date){
        this.date = date;
        return;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String toString(){
        String ret = "Amount: " + amount + "Description: " + description + "Date: " + date;
        return ret;
    }
}
