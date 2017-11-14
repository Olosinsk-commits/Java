package bankaccount;

/**
 * This class extends BankAccount class and represent an active or inactive
 * account. BankAccount and SavingsAccount Classes (#9)
 *
 * @author olga.osinskaya
 */
public class SavingsAccount extends BankAccount {

    boolean status; //hold status variable to represent an active or inactive account

    public SavingsAccount(double bal, double anrate) {
        super(bal, anrate);
    }

    /**
     * This method determines whether the account is inactive before a
     * withdrawal is made.(No withdrawal will be allowed if the account is not
     * active.) A withdrawal is then made by calling the superclass version of
     * the method.
     *
     * @param amountofd
     */
    public void Withdraw(double amountofd) {
        if (balance >= 25) {
            status = true;
            super.withdraw(amountofd);
        } else {
            status = false;
            System.out.println("Your account is inactive. Your balance needs to be over $25.");
        }
    }

    /**
     * This method determines whether the account is inactive before a deposit
     * is made. If the account is inactive and the deposit brings the balance
     * above $25, the account becomes active again. A deposit is then made by
     * calling the superclass version of the method.
     *
     * @param amountofd
     */
    public void Deposit(double amountofd) {
        double newbalance = balance + amountofd;
        if (newbalance >= 25) {
            status = true;
            super.deposit(amountofd);
        } else {
            System.out.println("Your account is inactive. Your balance needs to be over $25.");
        }

    }

    /**
     * The monthlyProcess method checks the number of withdrawals. If the number
     * of withdrawals for the month is more than 4, a service charge of $1 for
     * each withdrawal above 4 is added to the superclass field that holds the
     * monthly service charges. (Don’t forget to check the account balance after
     * the service charge is taken. If the balance falls below $25, the ccount
     * becomes inactive.)
     */
    public void monthlyProcess() {
        int eachch = 0;
        if (numOfWithdrawls > 4) {
            eachch = numOfWithdrawls - 4;
        }
        serviceCharges = eachch * 1;
        balance = balance - serviceCharges;
        if (balance >= 25) {
            status = true;
        } else {
            status = false;
            System.out.println("Your account is inactive. Your balance needs to be over $25.");
        }
    }

    /**
     * The printStatus method display the result
     */
    public void printStatus() {
        System.out.println("Balance: $" + balance);
        System.out.println("Account status: " + status);
        System.out.println("Number of withdrawls: " + numOfWithdrawls);
        System.out.println("Number of deposits this month: " + numOfDeposits);
        System.out.println("Annual interest rate: %" + rate);
        System.out.println("Monthly service charges: $" + serviceCharges);

    }
}
