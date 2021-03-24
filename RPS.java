import java.util.Scanner;

    public class RPS {
        public static void main(String[] args)
        {

            Scanner scan = new Scanner(System.in);

            final String ROCK = "rock";
            final String PAPER = "paper";
            final String SCISSORS = "scissors";
            final String QUIT = "q";

            final String Player1Win = "Первый игрок выиграл!";
            final String Player2Win = "Второй игрок выиграл!";
            final String TIE_MSG = "Ничья!";

            String player1Hand = "";
            String player2Hand = "";
            String roundResult = "Первый игрок выбрал %s, второй игрок выбрал %s\n";
            String scoreMsg = "Счет первого игрока: %d, Счёт второго игрока: %d\n\n";
            String winnerMsg = "";
            int player1Score = 0;
            int player2Score = 0;

            while (true)
            {
                System.out.println("Первый игрок: напиши \"rock\", \"paper\", or \"scissors\" или (\"q\" чтобы выйти):  ");

                boolean inputValid = true;
                player1Hand = scan.next();

                if (  !(   player1Hand.equals(ROCK)
                        || player1Hand.equals(PAPER)
                        || player1Hand.equals(SCISSORS)
                        || player1Hand.equals(QUIT)     ))
                {
                    inputValid = false;
                }

                while (!inputValid) {

                    System.out.println("Некорректный ввод!! (Введи \"rock\", \"paper\"," +
                            "\"scissors\", или \"q\")");

                    player1Hand = scan.next();

                    if (       player1Hand.equals(ROCK)
                            || player1Hand.equals(PAPER)
                            || player1Hand.equals(SCISSORS)
                            || player1Hand.equals(QUIT)		)
                    {
                        inputValid = true;
                    }
                }


                if (player1Hand.equals(QUIT))
                {
                    System.out.println("Окей, спасибо за игру!!");
                    return;
                }

                // Randomly generate computer's hand
                System.out.println("Второй игрок: напиши \"rock\", \"paper\", or \"scissors\" или (\"q\" чтобы выйти):  ");

                boolean inputValid2 = true;
                player2Hand = scan.next();

                if (  !(   player2Hand.equals(ROCK)
                        || player2Hand.equals(PAPER)
                        || player2Hand.equals(SCISSORS)
                        || player2Hand.equals(QUIT)     ))
                {
                    inputValid2 = false;
                }

                while (!inputValid2) {

                    System.out.println("Некорректный ввод!! (Впиши \"rock\", \"paper\"," +
                            "\"scissors\", или \"q\")");

                    player2Hand = scan.next();

                    if (       player2Hand.equals(ROCK)
                            || player2Hand.equals(PAPER)
                            || player2Hand.equals(SCISSORS)
                            || player2Hand.equals(QUIT)		)
                    {
                        inputValid2 = true;
                    }
                }


                if (player2Hand.equals(QUIT))
                {
                    System.out.println("Ок спс за игру!");
                    return;
                }

                if (player1Hand.equals(player2Hand))
                {
                    winnerMsg = TIE_MSG;
                }
                else
                {
                    switch (player2Hand)
                    {
                        case ROCK:
                            if (player1Hand.equals(PAPER))
                            {
                                winnerMsg = Player1Win;
                                player1Score++;
                            }
                            else if (player1Hand.equals(SCISSORS))
                            {
                                winnerMsg = Player2Win;
                                player2Score++;
                            }
                            break;

                        case PAPER:
                            if (player1Hand.equals(ROCK))
                            {
                                winnerMsg = Player2Win;
                                player2Score++;
                            }
                            else if (player1Hand.equals(SCISSORS))
                            {
                                winnerMsg = Player1Win;
                                player1Score++;
                            }
                            break;

                        case SCISSORS:
                            if (player1Hand.equals(ROCK))
                            {
                                winnerMsg = Player1Win;
                                player1Score++;
                            }
                            else if (player1Hand.equals(PAPER))
                            {
                                winnerMsg = Player2Win;
                                player2Score++;
                            }
                            break;
                    }
                }

                System.out.format(roundResult, player1Hand, player2Hand);
                System.out.println(winnerMsg);
                System.out.format(scoreMsg, player1Score, player2Score);

            }

        }
    }