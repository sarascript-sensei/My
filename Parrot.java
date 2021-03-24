public class Parrot extends Birds {
    private String words;
    public Parrot(String name, String words) {
        super(name);
        this.words = words;
    }
    //Метод повторения слов 3 раза
    void repeatWords(String words) {
        int i = 0;
        while (i<3) {
            System.out.println(words);
            i++;
        }
    }
}
