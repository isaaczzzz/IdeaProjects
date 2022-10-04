package fifth;

public class CollegeStudent extends Student{
    protected String speciality;
    protected String researchDirection;

    public void setData(String name, char sex, int age, int sID, int classNo, String speciality, String researchDirection) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sID = sID;
        this.classNo = classNo;
        this.speciality = speciality;
        this.researchDirection = researchDirection;
    }

    public String getData() {
        return "CollegeStudent{" +
                "speciality='" + speciality + '\'' +
                ", researchDirection='" + researchDirection + '\'' +
                ", sID=" + sID +
                ", classNo=" + classNo +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
