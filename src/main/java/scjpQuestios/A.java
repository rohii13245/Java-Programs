package scjpQuestios;

public class A {
    static {
        System.out.println("static key");
    }
    {
        System.out.println("block");
    }
    public A(){
        System.out.println("A");
    }

    public static void main(String[] args) {
        A obj=new A();
        int i=0010;
        System.out.println(i);
        byte b=6;
        b+=7;
        System.out.println(b);
        b= (byte) (b+7);        //cast int into byte
        System.out.println(b);

    }
}
