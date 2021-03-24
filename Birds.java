public class Birds {
    private String name;


    public String getName() {
        return name;
    }

    public Birds (String name) {
        this.name = name;
    }
    public void birdsCan () {
        System.out.println("Птица умеет летать и кушать: " + name);
    }
}
