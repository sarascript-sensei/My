public class Animal {
    private  String name;
    private String type_animal;

    public String getName() {
        return name;
    }
    public String getType_animal() {
        return type_animal;
    }
    public Animal (String name, String type_animal) {
        this.name = name;
        this.type_animal = type_animal;
    }

    public void displayName ()
    {
    System.out.println("Имя животного: " + name);
    }

    public  void displayType ()
    {
        System.out.println("И это: " + type_animal);
    }
    public void eat()
    {
        System.out.println("Кушает...");
    }
}
