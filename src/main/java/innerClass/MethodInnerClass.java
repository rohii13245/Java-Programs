package innerClass;

public class MethodInnerClass {

    public void data(){

        class InnerClass{

            public void innerClassData() {

                System.out.println("inner class method");
            }

        }

        InnerClass obj1=new InnerClass();
        obj1.innerClassData();
        System.out.println("outer class method");
    }

    public static void main(String[] args) throws Exception{
        MethodInnerClass obj=new MethodInnerClass();
        obj.data();
    }
}
