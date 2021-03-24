package interfaces;

class Percussion implements Instrument {
    public void play() {
        System.out.println("Percussion playing");
    }

    public String what() {
        return "Percussion";
    }

    public void adjust() {
    }
}
