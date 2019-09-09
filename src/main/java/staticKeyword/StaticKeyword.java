package staticKeyword;

public class StaticKeyword {
    private static int members = 0;
    private String first;
    private String last;

    public StaticKeyword(String fn, String ln) {

        first = fn;
        last = ln;
        members++;

        System.out.printf(" %s & %s ,member %d\n", first, last, members);

    }

    public int getMembers() {
        return members;
    }


}
