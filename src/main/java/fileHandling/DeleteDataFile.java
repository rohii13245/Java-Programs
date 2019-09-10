package fileHandling;

import java.io.IOException;
import java.io.PrintWriter;

public class DeleteDataFile {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("/home/codekul/Desktop/name/demo.txt");
        printWriter.close();
    }
}
