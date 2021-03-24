package interfaces;

import java.util.Scanner;

public class Hockey implements Sport{
    @Override
    public String teamLead() {
        return "ДСКА";
    }

    @Override
    public void createTeam() {
        Scanner input = new Scanner(System.in);
        System.out.println("Впишите количество участников: ");
        int s = input.nextInt();
        if(s<5) {
            System.out.println("Недостаточно участников для игры");
        }
        else if (s>10) {
            System.out.println("Слишком много участников");
        }
        else if (s>5 && s<10) {
            System.out.println("Можете создать команду");
        }
        else {
            System.out.println("Ошибка");
        }

    }

    @Override
    public void gamePlace() {
        System.out.println("Место: Ледовый каток");
    }
}
