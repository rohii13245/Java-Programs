package staticKeyword;

public class Main {

    public static void main(String[] args) {
        StaticKeyword sd1 = new StaticKeyword("potato", "fries");
        StaticKeyword sd2 = new StaticKeyword("aloo", "chips");
        StaticKeyword sd3 = new StaticKeyword("tomato", "ketchup");

        System.out.println();
        System.out.println(sd1.getMembers());


    }
}
