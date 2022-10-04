package fifth;

public class Teacher extends Person{
    private int tID;
    private String department;

    public void setData(String name, char sex, int age, int tID, String department) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tID = tID;
        this.department = department;
    }

    public String getData() {
        return "Teacher{" +
                "tID=" + tID +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
