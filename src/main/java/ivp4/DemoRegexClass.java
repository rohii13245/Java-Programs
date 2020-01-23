package ivp4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegexClass {

    public void match() {
        System.out.println(Matcher.quoteReplacement("geeksforge*ks"));
    }
    public static void main(String[] args) {
     DemoRegexClass d=new DemoRegexClass();

     d.match();

    }




}
