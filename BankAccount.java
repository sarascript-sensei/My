public class BankAccount {
    private int id;
    private int balance;

    public BankAccount() {
    }

    public BankAccount(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void Deposit(double balance_more) {
        System.out.println("Баланс до пополнения: " + balance);
        System.out.println("Баланс пополнен на: " + balance_more);
        balance += balance_more;
        System.out.println("Итог: " + balance);
        System.out.println();
    }

    public void Withdraw(double balance_less) {
        System.out.println("Баланс до снятия: " + balance);
        if (balance > 0) {
            balance -= balance_less;
            System.out.println("Успешно. Ваш баланс: " + balance);
        } else if (balance < 0) {
            System.out.println("Недостаточно средств ");
        }

    }

    static void info(int id, int balance) {
        System.out.println("Id: " + id + "\n" + "Balance:" + balance);
    }
}
