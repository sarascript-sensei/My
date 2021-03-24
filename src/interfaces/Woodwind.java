package interfaces;

class Woodwind extends Wind {
    public void play() {
        System.out.println("Woodwind playing");
    }
    public String what() {
        return "Woodwind";
    }
}