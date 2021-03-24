public class Banky_monkey {
    public int id;
    public int balance;

    public Banky_monkey (int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount.info(1, 15);
    }

}

