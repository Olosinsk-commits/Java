package bankaccount;

/**
 * The BankAccount class is an abstract class that holds general data about a
 * deposits. Classes representing specific actions on deposits should inherit
 * from this class. BankAccount and SavingsAccount Classes (#9)
 *
 * @author olga.osinskaya
 */
public abstract class BankAccount {

    double balance;// holds Balance
    int numOfDeposits;//holds Number of deposits this month
    int numOfWithdrawls;//holds Number of withdrawls
    double rate;//holds Annual interest rate
    double serviceCharges;//holds Monthly service charges

    public BankAccount() {
        balance = 0;
        numOfDeposits = 0;
        numOfWithdrawls = 0;
        rate = 0;
        serviceCharges = 0;
    }

    /**
     * The constructor accepts arguments for the balance and annual interest
     * rate
     *
     * @param bal the Balance
     * @param anrate the Annual interest rate
     */
    public BankAccount(double bal, double anrate) {
        this.balance = bal;
        this.rate = anrate;
    }

    /**
     * The deposit method accepts an argument for the amount of the deposit. The
     * method adds the argument to the account balance and increment the
     * variable holding the number of deposits
     *
     * @param amountofd the amount of the deposit
     */
    public void deposit(double amountofd) {
        this.balance = this.balance + amountofd;
        this.numOfDeposits++;
    }

    /**
     * The withdraw method accepts an argument for the amount of the withdrawal.
     * The method subtracts the argument from the balance and increment the
     * variable holding the number of withdrawals.
     *
     * @param amoutofw the amount of the withdrawal
     */
    public void withdraw(double amoutofw) {
        this.balance = this.balance - amoutofw;
        numOfWithdrawls++;
    }

    /**
     * This method updates the balance by calculating the monthly interest
     * earned by the account, and adding this interest to the balance.
     *
     * @return the balance
     */
    public double calcInterest() {
        double MonthlyInterestRate = (rate / 12);
        double MonthlyInterest = balance * MonthlyInterestRate;
        balance = balance + MonthlyInterest;
        return balance;
    }

    /**
     * This method subtracts the monthly service charges from the balance, calls
     * the calcInterest method. Also, it sets the variables withdrawals, number
     * of deposits, and monthly service charges to zero.
     */
    public void InterestmonthlyProcess() {
        balance -= serviceCharges;
        calcInterest();
        numOfDeposits = 0;
        numOfWithdrawls = 0;
        serviceCharges = 0;
    }
}
