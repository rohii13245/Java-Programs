package exceptionhandling;

public class StringIndexException {

    public static void main(String[] args) {
        try {

            String ch = "codekul is gurukul";
            System.out.println(ch.length());

            char c = ch.charAt(0);
            c = ch.charAt(20);

            System.out.println("String length is:" + c);

        } catch (StringIndexOutOfBoundsException b) {

            System.out.println("String index is out of bound:");

        }
    }
}
