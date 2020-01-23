package scjpQuestios;


public enum Title {
    MR("Mr."), MRS("Mrs."), MS("Ms.");
    private final String title;

    Title(String t) {
        title = t;
    }

    public static void main(String[] args) {
        System.out.println(Title.MR.format("Doe", "John"));
    }


    public String format(String last, String first) {
        return title + " " + first + " " + last;
    }

}
