package scjpQuestios;

public class xyz<s1, s2> {


    public static void main(String[] args) {
//        for(int i = 0; i < 2; i++) {
//            for(int j = 2; j>= 0; j--) {
//                if(i == j) break;
//                System.out.println("i=" + i + " j="+j);
//            }
//        }
//            Integer intobj=Integer.valueOf(args[args.length-1]);
//            int i= 14^23;
//        System.out.println(i);

//            if(args.length>1)
//                System.out.println(i);
//            if(args.length>0)
//                System.out.println(i-1);
//            else
//                System.out.println(i-2);
//
//  Q.12:      int i=0, j=2;
//        do {
//            i=++i;
//            j--;
//        } while(j>0);
//        System.out.println(i);
/*

        int i=1, j=1;
        try {
            i++;
            j--;
            if(i==j)
                i++;
        }
        catch(ArithmeticException e) {
            System.out.println(0);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(1);
        }
        catch(Exception e) {
            System.out.println(2);
        }
        finally {
            System.out.println(3);
        }
        System.out.println(4);

    }*/

        String s1 = "abc";
        String s2 = "abc";
        if (s1 == s2) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        if (s1.equals(s2))
            System.out.println(3);
        else
            System.out.println(4);

        int i = 1;
        do {
            i--;
        } while (i > 2);
        System.out.println(i);
    }

    }



