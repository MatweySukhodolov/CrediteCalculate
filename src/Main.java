public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int price = 1000000; // сумма кредита
        int time = 12;
        int time2 = 24;
        int time3 = 36;
        double percent1 = 9.99;
        double percent = percent1 / 100 / 12; // месячная процентная ставка
        int monthlyPayment1 = (int) (service.calculate(price, time, percent)); // ежемесячный платеж за 1 год
        int monthlyPayment2 = (int) (service.calculate(price, time2, percent)); // ежемесячный платеж за 2 года
        int monthlyPayment3 = (int) (service.calculate(price, time3, percent)); // ежемесячный платеж за 3 года
        System.out.println("Ежемесячный платеж на 1 год составляет:" + Math.round(monthlyPayment1) + " руб.");
        System.out.println("Ежемесячный платеж на 2 года составляет:" + Math.round(monthlyPayment2) + " руб.");
        System.out.println("Ежемесячный платеж на 3 года составляет:" + Math.round(monthlyPayment3) + " руб.");
    }
}