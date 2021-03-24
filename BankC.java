public class BankC extends bank {
    public int balance;
    @Override
    public void getBalance() {
        balance = 200;
        System.out.println("Баланс банка С: " + balance + "$");

    }
}
