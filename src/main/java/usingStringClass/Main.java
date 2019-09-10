package usingStringClass;

public class Main {
    public static void main(String[] args) {


        String s = "java";
         s.concat("rules");/* two string objects and only one reference variable*/

        s=s.concat("rules");
        System.out.println(s);


        String s1="spring";
       String s2= s1+"summer";
        s1.concat("fall");/*not useful this statement*/
        s2.concat(s1);/*not useful this statement*/
        s1 +="winter";
        System.out.println(s1+""+s2);
        System.identityHashCode(s1);

    }


}
