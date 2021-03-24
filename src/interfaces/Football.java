package interfaces;

public class Football implements Sport{
    @Override
    public String teamLead() {
        return "Harisha";

    }

    @Override
    public void createTeam() {
        System.out.println("Ошибка. На данный момент вы не можете создать футбольную команду. Попробуйте позже");

    }

    @Override
    public void gamePlace() {
        System.out.println("Место: Футбольное поле");
    }
}
