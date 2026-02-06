public class CreditCard extends PaymentMethod{
    private double creditLimit;

    public CreditCard(double creditLimit, String accountHolder, double balance){ // since am extending payment method am calling on its objects,
        // hence why I passed in it in as a parameter as accountHolder (name) is needed in a credit card
        //we also need to know the credi card limit and how much money is on the card balance
        super(accountHolder, balance); // calls their value into this class
        this.creditLimit = creditLimit; // storing the data of my parameter intomy instance object variable
    }

    public void processPayment(double amount){ // passing amount as a parameter for my method
        if(amount > balance + creditLimit){// checking if there enough of money in the card for what ever purchase
            System.out.println("Transaction Declined."); // amount either exceed credit limits or the amount of money in
            // the card is to low
        }
        else{
            balance -= amount; // if the amount of purchase is less than money in card deduct money
            // from credit card
            totalTransactions++; //incrementing amount of transactions, which so far is one
        }


    }

    @Override
    public String getPaymentStatus() {
        return "Sucessful";
    }

    @Override
    public void validateAccount() {

    }
}
