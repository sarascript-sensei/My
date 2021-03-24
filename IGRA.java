import java.util.Random;
import java.util.Scanner;
class IGRA {

    public static final String ROCK = "КАМЕНЬ";
    public static final String PAPER = "БУМАГА";
    public static final String SCISSORS = "НОЖНИЦЫ";

    public static void main(String args[]) {
        System.out.println("Играем в игру КАМЕНЬ НОЖНИЦЫ БУМАГААААААА.:  ");
        System.out.println("Ходит первый игрок!Твой выбор, Вася?:");

        String player1Move = getPlayer1Move();
        String player2Move = getPlayer2Move();

        if (player1Move.equals(player2Move))
            System.out.println("НИЧЬЯ !!");
        else if (player1Move.equals(IGRA.ROCK))
            System.out.println(player2Move.equals(IGRA.PAPER) ? "Второй игрок выиграл" : "Первый игрок выиграл");
        else if (player1Move.equals(IGRA.PAPER))
            System.out.println(player2Move.equals(IGRA.SCISSORS) ? "Второй игрок выиграл" : "Первый игрок выиграл");
        else
            System.out.println(player2Move.equals(IGRA.ROCK) ? "Второй игрок выиграл" : "Первый игрок выиграл");
    }
    public static String getPlayer1Move()
    {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String player1move = input.toUpperCase();
        System.out.println("Ход первого игрока: "+ player1move);
        return player1move;
    }
    public static String getPlayer2Move()
    {
        System.out.println("Ходит второй игрок!Твой выбор, Антон?:");
        System.out.println("");
        System.out.println("Ну или не Антон, крч ходи давай уже мы тебя тут ждем");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String player2move = input.toUpperCase();
        System.out.println("Ход второго игрока: "+ player2move);
        return player2move;
    }
}