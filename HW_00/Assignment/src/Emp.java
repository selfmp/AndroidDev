public class Emp {
    private static int id;
    private double amount;
    private String accountHolderName;
    private String accountType;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Emp.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAllInfo() {
        return (accountHolderName+" "+accountType+": Balance="+amount);
    }
}