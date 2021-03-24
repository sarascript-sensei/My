public class Home {
    private int etaji;
    private int year_of_build;
    private String name;
    private String cvetglaz;

    public Home(String name, int year_of_build, int etaji, String cvetglaz) {
        this.name = name;
        this.year_of_build = year_of_build;
        this.etaji = etaji;
        this.cvetglaz = cvetglaz;
    }

    //Геттеры
    public String getName() {
        return name;
    }

    public int getEtaji() {

        return etaji;
    }

    public int getYear_of_build() {
        return year_of_build;
    }


    //Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setEtaji(int etaji) {
        this.etaji = etaji;
    }

    public void setYear_of_build(int year_of_build) {
        this.year_of_build = year_of_build;
    }

    //метод, возвращающий количество лет с момента постройки.
    public void year_of_building(int years_since_build) {
        System.out.println("Год постройки" + year_of_build);
        System.out.println("Сейчас 2020 год, значит:");
        year_of_build = 2020 - years_since_build;
        System.out.println("Прошло " + year_of_build + " лет");
    }
//Метод, который отображает все значения
    public void info() {
        System.out.println("Наименование: " + getName() + ", Год постройки: " + getYear_of_build() + ", Этажи: " + getEtaji());
    }
}
