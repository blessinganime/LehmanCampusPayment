import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Payable> paymentQueue = new ArrayList<>();
        CreditCard C = new CreditCard(1000.0, "Blessing", 600.0);
        MealPlan M = new MealPlan("Iva", 200.0);

        paymentQueue.add(C);
        paymentQueue.add(M);

        for(Payable money : paymentQueue){
            money.processPayment(50.0);
            System.out.println(PaymentMethod.totalTransactions); // I dont think my output is supposed to look like this
            // am not sure what am doing wrong?
        }
    }
}
