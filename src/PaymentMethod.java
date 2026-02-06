public abstract class PaymentMethod implements Payable {
    protected  String accountHolder; // using protected varable so they can only be accessed in this class
    protected double balance;

    static int totalTransactions = 0; // since no payment has been process its set to zero

    public PaymentMethod(String accountHolder, double balance){ // passing in my parameter to store temporary data
        this.accountHolder = accountHolder; // storing a copy of parameters values into instance object variables
        this.balance = balance;
    }

    abstract void validateAccount();
}
