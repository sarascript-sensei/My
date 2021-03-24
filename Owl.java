public class Owl extends Birds{
    private String daytime;

    public Owl(String name, String daytime) {
        super(name);
        this.daytime = daytime;
    }

    @Override
    public void birdsCan() {
        System.out.println("«Птица много спит и кушает крупную\n" +
                "жертву: " + getName());
    }
    //вывод в зависимости от daytime
    public void sleepTime(String daytime) {
        if (daytime == "day") {
            System.out.println("Owl is sleepeing, don't disturb");
        }
        else if (daytime == "night") {
            System.out.println("Owl is not sleeping");
        }
        else {
            System.out.println("Error");
        }
    }
}
