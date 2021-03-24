public class Cat
{
    private String name;
    private int weight;
    private int year;
    private String color;
    private String addres;

    //Только имя
    public Cat (String name)
    {
        this.name = name;
        this.weight = 3;
        this.year = 15;
    }
    //Имя, вес, возраст
    public Cat (String name, int weight, int year)
    {
        this.name = name;
        this.weight = weight;
        this.year = year;
    }
    //Имя, возраст (вес стандартный)
    public Cat (String name, int year)
    {
        this.name = name;
        this.year = year;
        this.weight = 2;
    }
    //вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
    public Cat (int weight, String color)
    {
        this.weight = weight;
        this.color = color;
        this.year = 1;
    }
    // вес, цвет, адрес ( чужой домашний кот)
    public Cat (int weight, String color, String addres)
    {
        this.weight = weight;
        this.color = color;
        this.addres = addres;
        this.year = 3;
    }

    public static void main(String ... args) {
        Cat cat = new Cat("Барсик");
        Cat cat1 = new Cat("Лимон", 1, 1);
        Cat cat2 = new Cat("Гаррик", 3);
        Cat cat3 = new Cat(4, "Рыжий");
        Cat cat4 = new Cat(1, "Белый", "Хогвартс");
        System.out.println(cat.name);
        System.out.println(cat1.name + cat1.weight + cat1.year);
    }

}
