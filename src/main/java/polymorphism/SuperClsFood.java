package polymorphism;

public class SuperClsFood {

    public static void main(String[] args) {
        SuperClsFood[] food = new SuperClsFood[2];

        SuperClsFood fd = new SuperClsFood();

        fd.eat();

        food[0] = new ChildClsPapaya();

        food[1] = new ChildClsTunaFish();

        for (int i = 0; i < 2; ++i) {
            food[i].eat();
        }
    }

    void eat() {

        System.out.println("this food is great:");

    }
}
