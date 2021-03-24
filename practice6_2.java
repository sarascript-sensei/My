import java.util.Scanner;

public class practice6_2 {
    public static class BankAccount {
        private String Number;
        private String type;
        private double balance;


        void moremoney(double sumPopolnenia) {
            System.out.println("Баланс до пополнения: " + balance);
            System.out.println("Баланс пополнен на: " + sumPopolnenia);
            balance += sumPopolnenia;
            System.out.println("Итог: " + balance);
            System.out.println();
        }

        void lessmoney(double summaSnyatiya) {
            System.out.println("Баланс до снятия: " + balance);
            System.out.println("Баланс уменьше на: " + summaSnyatiya);
            balance -= summaSnyatiya;
            System.out.println("Итог: " + balance);
            System.out.println();
        }
    }
        public static void main(String[] args) {
            BankAccount MyAccount = new BankAccount();
            MyAccount.Number="2312";
            MyAccount.type="Deposit";
            MyAccount.balance=4304;
            MyAccount.moremoney(5.3);
            MyAccount.lessmoney(235);
            if(MyAccount.balance>0){
                System.out.println("Можно совершать операцию ");
            }else {
                System.out.println("Недостаточно средств ");
            }
            System.out.println(MyAccount.balance);
        }
    }