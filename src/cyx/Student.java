package cyx;

public class Student {
    private int studentID;
    private String name;
    private int age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }

    public Student(int studentID, String name, int age, String addr) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public int getStudentID() {
        return studentID;

    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    private String addr;

}
