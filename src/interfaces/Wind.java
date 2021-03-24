package interfaces;

class Wind implements Instrument {
    public void play() {
        System.out.println("Wind playing");
    }

    public String what() {
        return "Wind";
    }

    public void adjust() {
    }
}
