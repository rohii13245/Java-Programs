package exceptionhandling;

public class TestException {

    public static void main(String[] args) {
        int num1,num2,ans;

        try {
            num1=0;
            num2=10;

            ans=num2/num1;

            System.out.println(ans);

        }catch (ArithmeticException e){

            System.out.println("num can not divide by zero");

        }catch (Exception e){

            System.out.println("Exception can handle");
        }

        System.out.println("prog execution is done");


    }

}
