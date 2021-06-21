package day_one.student_system;

import java.io.Serializable;

public class Student implements Serializable {
    private int stId;
    private String name;
    private String address;
    private String gender;
    private String status;
    private int age;
    private String contactNum;
    private String DOB;

    public Student(){}
//
//    public Student(int stId, String name, String address, String gender, String status, int age, String contactNum, String DOB) {
//        this.stId = stId;
//        this.name = name;
//        this.address = address;
//        this.gender = gender;
//        this.status = status;
//        this.age = age;
//        this.contactNum = contactNum;
//        this.DOB = DOB;
//    }

    public int getStId() {
        return stId;
    }

    @Override
    public String toString() {
        return "Student: \n" +
                "stId = " + stId +
                "\nname = " + name +
                "\naddress = " + address +
                "\ngender='" + gender +
                "\nstatus='" + status +
                "\nage=" + age +
                "\ncontactNum='" + contactNum +
                "\nDOB='" + DOB;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}
