package encapsulation;

public class EncapTest {
    private String name;
    private int rollNo;

    public static void main(String[] args) {
        EncapTest en = new EncapTest();

        en.setName("rohini");
        en.setRollNo(3);
    }

    public int getRollNo() {
        return rollNo;

    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("roll no is:" + rollNo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("name is:" + name);
    }
}
