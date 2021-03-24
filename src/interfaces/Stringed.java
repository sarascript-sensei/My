package interfaces;

class Stringed implements Instrument {
    public void play() {
        System.out.println("Stringed playing");
    }
    public String what() {
        return "Stringed";
    }
    public void adjust() {
    }
}
