public class SportCar extends Car {

    @Override
    public void gas() {
        System.out.println("Не гоняй! ");
    }

    @Override
    public void brake() {
        System.out.println("Спортивная машина тормозиииииит!");
    }

}