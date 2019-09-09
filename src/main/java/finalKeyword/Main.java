package finalKeyword;

public class Main {
    public static void main(String[] args) {
        FinalKeyword fk=new FinalKeyword(10);

        for(int i=0;i<5;i++) {
            fk.add();
            System.out.printf("%s",fk);
        }
    }
}
