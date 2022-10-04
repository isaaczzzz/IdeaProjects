package com.nosuch.pojo;

public class Owner {
    private int PersonID;
    private String Name;
    private String Gender;
    private String Occupation;
    private String Addr;
    private String Tel;

    public int getPersonID() {
        return PersonID;
    }

    public void setPersonID(int personID) {
        PersonID = personID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String addr) {
        Addr = addr;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "PersonID=" + PersonID +
                ", Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Occupation='" + Occupation + '\'' +
                ", Addr='" + Addr + '\'' +
                ", Tel='" + Tel + '\'' +
                '}';
    }
}
