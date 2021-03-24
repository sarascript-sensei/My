public class FamilyCar extends Car {

    @Override
    public void gas() {
        System.out.println("Едь аккуратно! В салоне дети! ");
    }

    @Override
    public void brake() {
        System.out.println("Остановка !!!");
    }

}