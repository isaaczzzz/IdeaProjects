package fifth;

public class Undergraduate extends CollegeStudent{
    private String school;

    public void setData(String name, char sex, int age, int sID, int classNo, String speciality, String researchDirection, String school) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sID = sID;
        this.classNo = classNo;
        this.speciality = speciality;
        this.researchDirection = researchDirection;
        this.school = school;
    }

    public String getData() {
        return "Undergraduate{" +
                "school='" + school + '\'' +
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
