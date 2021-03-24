package interfaces;

public class Cat extends Animal{

    public Cat(String name, String favouritefood) {
        super(name, favouritefood);
    }

    @Override
    public void manageSelf(String name, String favouriteFood) {
        System.out.println("I am +" + name + " and my favourite food is +" + favouriteFood + " MEEEEEEEEEOW" );
    }
}
