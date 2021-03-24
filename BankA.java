public class BankA extends bank{
    public int balance;

    @Override
    public void getBalance() {
        balance = 100;
        System.out.println("Баланс банка А: " + balance  + "$");
    }
}
