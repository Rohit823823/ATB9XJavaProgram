package Nov.ex_14112024;

public class Lab_165 {
    public static void main(String[] args) {
        ATB s1 = new ATB("Amit");
        ATB s2 = new ATB("Suraj");
        ATB s3 = new ATB("Tushar");
        ATB s4 = new ATB("Balaji");

        ATB s5;
        new ATB("Pramod");

        s1.readDocuments();
        s2.readDocuments();

        // Static
        ATB.doAssignment(); // Static Method
        System.out.println(ATB.course_name); // Static Variable

    }
}
class ATB {
    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
        System.out.println("Reading from CSV file");
    }
    static {
        System.out.println("Load the class I will execute");
    }
    private String name;
    private String phone;
    static String course_name="ATB9X";

    public String getName() {
        return name;
    }

    public ATB(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocuments(){
        System.out.println("Non Static Method");
        System.out.println(course_name);
    }

    static void doAssignment(){
        //System.out.println(phone);
        System.out.println("Do Assignment");
    }

    static class GenAI{
        // 0.0001% in Automation
    }

}
