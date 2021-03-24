public class INAI {
    private String name;
    private String last_name;
    private int age;
    private String faculty;

    public INAI (String n, String last_name, int age, String faculty) {
        this.name = n;
        this.last_name = last_name;
        this.age = age;
        this.faculty = faculty;
    }
        public String getName() {
        return name;
    }
     public String getLast_name() {
        return last_name;
     }
     public String getFaculty() {
        return faculty;
     }
     public int getAge () {
        return age;
     }
     public void setName (String name) {
        this.name = "Sara";
     }
     public void setLast_name (String last_name) {
        this.last_name = "Connor";
     }

    public void setFaculty(String faculty) {
        this.faculty = "Ain-1-19";
    }

    public void setAge(int age) {
        this.age = 20;
    }
    public void info () {
        if(age<20) {
            System.out.println("Слишком молодой");
        }
        else {
            System.out.println("Добро пожаловать в клуб престарелых");
        }
    }
}

