package constructor;

public class UsingConstructor {
    private int month;
    private int day;
    private int year;

    public UsingConstructor(int m, int d, int y) {
        month = m;
        day = d;
        year = y;

        System.out.printf("the constructor is %s\n", this);
    }

    public static void main(String[] args) {
        UsingConstructor con = new UsingConstructor(4, 5, 6);
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
