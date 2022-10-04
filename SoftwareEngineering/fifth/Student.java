package fifth;

public class Student extends Person{
    protected int sID;
    protected int classNo;

    public void setData(String name, char sex, int age, int sID, int classNo) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sID = sID;
        this.classNo = classNo;
    }

    public String getData() {
        return "Student{" +
                "sID=" + sID +
                ", classNo=" + classNo +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
