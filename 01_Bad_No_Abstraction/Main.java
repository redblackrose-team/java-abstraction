public class Main {
    public static void main(String[] args) {
        Cash cashPayment = new Cash();
        cashPayment.pay(10.0);

        CreditCard creditCardPayment = new CreditCard();
        creditCardPayment.pay(25.0);
    }
}
