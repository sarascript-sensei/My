package interfaces;

public class Employee implements Person {
    private String name;
    private String mail;
    private String department;

    public Employee (String name, String mail, String department) {
        this.name = name;
        this.mail = mail;
        this.department = department;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMail() {
        return mail;
    }

    @Override
    public String getGrade(){
        return null;
    }


    @Override
    public void getDescription() {
        System.out.println(name + " -Сотрудник отдела:  " + department );
    }

    @Override
    public String getSubject() {

        return null;
    }

    @Override
    public String getDepartment() {
        return department;
    }

}
