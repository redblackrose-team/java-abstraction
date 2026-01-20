public class Main {
    public static void main(String[] args) {

        PaymentMethod payment = new CreditCard(); // Currently using CreditCard

        payment.pay(50.0);

        payment = new Cash(); // Now using Cash
        payment.pay(20.0);
    }
}
