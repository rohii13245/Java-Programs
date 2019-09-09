package polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal[] index = new Animal[2];
        Dog d = new Dog();
        Cat c = new Cat();

        index[0] = d;
        index[1] = c;


        for (Animal x : index) {
            x.sound();

        }

    }
}
