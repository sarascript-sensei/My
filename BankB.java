public class BankB extends bank {
    public int balance;
    @Override
    public void getBalance() {
        balance = 150;
        System.out.println("Баланс банка Б: " + balance  + "$");

    }
}
