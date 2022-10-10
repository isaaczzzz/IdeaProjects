package sixth;

public class Student implements Print, Person{
    private int id;
    private String name;
    private String birthday;
    private String sex;
    private String speciality;

    @Override
    public void setData(int id, String name, String birthday, String sex, String speciality) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.speciality = speciality;
    }

    @Override
    public String getData() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this.getData());
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setData(1, "张三", "2003-10-10", "male", "SoftwareEngineering");
        student.print();
    }

}
