package scjpQuestios;

public class DemoClass {

    public void A() {
        int[][] array2D = {{0, 1, 2}, {2, 3, 4}};

        System.out.println(array2D[0].length+"");
        System.out.println(array2D[1].getClass().isArray()+"");
        System.out.println(array2D[0][1]);


    }
    public static void main(String[] args) {
        DemoClass d=new DemoClass();
        d.A();

        StringBuilder sb1=new StringBuilder("123");
        String s1="123";
        sb1.append("abc");
        s1=s1.concat("abc");
        System.out.println(sb1+""+s1);
    }
}
