package student_system;

public class Student {
    private int stId;
    private String name;
    private String address;
    private String gender;
    private String status;
    private int age; //
    private String contactNum;
    private String DOB;

    public Student(int stId, String name, String address, String gender, String status, int age, String contactNum, String DOB) {
        this.stId = stId;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.status = status;
        this.age = age;
        this.contactNum = contactNum;
        this.DOB = DOB;
    }
}
