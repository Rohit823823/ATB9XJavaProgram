package Nov.ex_21112024;

public class Student {
    private String name;
    private String rollnumber;

    public Student(String name, String rollnumber) {
        this.name = name;
        this.rollnumber = rollnumber;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }
    public void printDetails() {
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll No: " + this.rollnumber);

    }
}
