package fileHandling;


import java.io.*;

public class UpdateFile {
    public static void main(String[] args) throws IOException {


        Writer output = null;
        File file = new File("/home/codekul/Desktop/name/demo.txt");
        output = new BufferedWriter(new FileWriter(file, true));
        output.write("how are you");
        output.close();
    }
}
