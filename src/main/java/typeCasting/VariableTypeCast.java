package typeCasting;

public class VariableTypeCast {

    public static void main(String[] args) {
        double a = 87.5;
        int k = (int) 87.5;
        System.out.println("its done explicitly:" + k);
        int m = 5;
        double r = m;
        System.out.println("its done implicitly:" + r);
    }
}
