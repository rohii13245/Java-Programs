package exceptionhandling;

public class NoFormatException {
    public static void main(String[] args) {

        System.out.println("1st output when code is right:");

        String num = "10";
        int res = Integer.parseInt(num);

        System.out.println("the string converted into integer:" + res);

        System.out.println("2nd output when exception occur:");

        try {
            int result = Integer.parseInt("abc");
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("string is not converted to integer:");
        }

    }
}
