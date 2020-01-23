package scjpQuestios;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public enum Test {
    BREKFAST (7,30),LUNCH(12,14),DINNER(8,40);

    private int hh;
    private int mm;


    Test(int hh,int mm){
        assert (hh >= 0 && hh <= 23) : "Illegal hour.";
        assert (mm >= 0 && mm <= 59) : "Illegal mins.";
        this.hh = hh;
        this.mm = mm;
    }

    public int getHh() {
        return hh;
    }

    public int getMm() {
        return mm;
    }

    public static void main(String[] args) {
        Test t= LUNCH;
        Test t1=BREKFAST;
        Test t2=DINNER;

        System.out.println(t.getHh()+":"+t.getMm());
        System.out.println(t1.getHh()+":"+t1.getMm());
        System.out.println(t2.getHh()+":"+t2.getMm());
    }
}
