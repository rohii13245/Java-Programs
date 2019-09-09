package finalKeyword;

public class FinalKeyword {
    private int sum;
     private final int NUM;

     public FinalKeyword(int x){
         NUM=x;
     }

     public void add(){
         sum+=NUM;
     }

     public String toString(){
         return String.format("sum = %d\n",sum);
     }
}
