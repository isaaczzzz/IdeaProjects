package fifth;

public class PhD extends CollegeStudent{
    private String tutor;

    public void setData(String name, char sex, int age, int sID, int classNo, String speciality, String researchDirection, String tutor) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sID = sID;
        this.classNo = classNo;
        this.speciality = speciality;
        this.researchDirection = researchDirection;
        this.tutor = tutor;
    }

    public String getData() {
        return "Postgraduate{" +
                "tutor='" + tutor + '\'' +
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
