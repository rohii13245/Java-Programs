package exceptionhandling;

public class ArrayException {
    public static void main(String[] args) {

        try {
            int[] a = new int[10];
            a[11] = 9;

            System.out.println(a);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("array size is not proper:");
        }

    }
}
