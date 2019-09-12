package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {

        try {
            Writer w = new FileWriter("/home/codekul/Desktop/demo.txt");
            String content = "hii sizuka how r u?";
            w.write(content);
            w.close();

            System.out.println("Done");


        } catch (IOException e) {
            System.out.println("operation failed:");
            e.printStackTrace();
        }
    }
}
