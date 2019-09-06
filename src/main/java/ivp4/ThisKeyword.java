package ivp4;

public class ThisKeyword {

    private int hour=3;
    private int min=12;
    private int sec=23;

    public void setTime(){
        int hour=2;
        int min=3;
        int sec=4;
    }

    public String getTime(){
        return String.format("%d:%02d:%02d",hour,min,sec);
    }


}
