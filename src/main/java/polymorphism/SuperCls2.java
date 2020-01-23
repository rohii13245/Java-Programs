package polymorphism;

public class SuperCls2 {

    public static void main(String[] args) {
        ChildClsFatty fat = new ChildClsFatty();

        SuperClsFood pa = new ChildClsTunaFish();
        SuperClsFood tf = new ChildClsPapaya();
        SuperClsFood fo = new SuperClsFood();

        fat.digest(fo);
        fat.digest(pa);
        fat.digest(tf);
    }

}
