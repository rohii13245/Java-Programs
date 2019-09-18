package innerClass;

public class OuterClass {

    private int a, b;

    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.showdata();

        OuterClass.InnerClass obj1 = obj.new InnerClass();
        obj1.display();
    }

    public void showdata() {
        System.out.println("outer class method\n");
    }

    public class InnerClass {

        public void display() {
            System.out.println("inner class method\n");
            a = 9;
            b = 9;
            int sum;
            sum = a + b;
            System.out.println("sum is:" + sum);


        }

    }
}
