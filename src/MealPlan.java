public class MealPlan extends PaymentMethod{
    public MealPlan(String accountHolder, double balance){
        super(accountHolder, balance);
    }

    @Override
    public void validateAccount(){
        if(balance < 0) {
            System.out.println("Account not valid");
        }
    }

    public void processPayment(double amount){
        validateAccount();

        if(amount > balance){
            System.out.println("Transaction declined.");
        }
        else{
            balance -= amount;
            totalTransactions++;
            System.out.println("Sucess!");
        }
    }

    @Override
    public String getPaymentStatus() {
        return "Successful!";
    }

}
