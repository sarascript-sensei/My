public class PhysicTeacher extends Teacher{
    private String subject_name;
    private int student_quantity;

    public PhysicTeacher(String name, String last_name, int work_experience, String subject_name, int student_quantity) {
        super(name, last_name, work_experience);
        this.subject_name = subject_name;
        this.student_quantity = student_quantity;
    }
    @Override
    public void DisplayInfo() {
        System.out.println("Имя учителя: " + getName() + "." + "Фамилия учителя: " + getLast_name()+ "." + "Опыт работы: " + getWork_experience()+ " лет." + "Название предмета: "+ subject_name + "." + "Количество студентов: " + student_quantity);
    }

}
