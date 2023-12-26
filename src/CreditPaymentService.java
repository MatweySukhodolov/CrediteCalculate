public class CreditPaymentService {
    public double calculate(int price, int time, double percent) {
        double monthlyPayment1 = price * percent / (1 - Math.pow(1 + percent, -time));
        int monthlyPayment1Int = (int) monthlyPayment1;
        return monthlyPayment1Int;
    }
}