/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 * This program demonstrates the SavingsAccount class BankAccount and
 * SavingsAccount Classes (#9)
 *
 * @author olga.osinskaya
 */
public class BADemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create a SavingAccount object
        SavingsAccount customer1 = new SavingsAccount(1000, 10);
        //cal the methods and test it
        customer1.Deposit(100);
        customer1.Deposit(100);
        customer1.Withdraw(300);
        customer1.Withdraw(300);
        customer1.Withdraw(60);
        customer1.Withdraw(30);
        customer1.Withdraw(30);
        customer1.monthlyProcess();
        customer1.printStatus();

    }
}
