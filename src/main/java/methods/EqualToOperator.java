package methods;

public class EqualToOperator {

    public static void main(String[] args) {
        String s1= new String("hello");
        String s2=new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3="hii";
        String s4="hii";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
