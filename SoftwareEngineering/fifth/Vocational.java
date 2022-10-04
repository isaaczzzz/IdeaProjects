package fifth;

public class Vocational extends CollegeStudent{
    private String job;

    public void setData(String name, char sex, int age, int sID, int classNo, String speciality, String researchDirection, String job) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sID = sID;
        this.classNo = classNo;
        this.speciality = speciality;
        this.researchDirection = researchDirection;
        this.job = job;
    }
    public String getData() {
        return "Vocational{" +
                "job='" + job + '\'' +
                ", speciality='" + speciality + '\'' +
                ", researchDirection='" + researchDirection + '\'' +
                ", sID=" + sID +
                ", classNo=" + classNo +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
