public class Teacher {
    private String name;
    private String last_name;
    private int work_experience;

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getWork_experience() {
        return work_experience;
    }
    public Teacher (String name, String last_name, int work_experience) {
        this.name = name;
        this.last_name =last_name;
        this.work_experience = work_experience;
    }

    public void DisplayInfo() {
        System.out.println("Имя: " + name + "," + "фамилия: " + last_name + "," + "стаж работы: " + work_experience);
    }
}
