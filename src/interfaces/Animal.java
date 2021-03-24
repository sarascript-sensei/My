package interfaces;

public abstract class Animal {
    String name;
    String favouriteFood;

    public Animal(String name, String favouritefood) {

    }

    public abstract void manageSelf(String name, String favouriteFood);
}
