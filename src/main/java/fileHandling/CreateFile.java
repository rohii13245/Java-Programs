package fileHandling;


import java.io.*;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {


        FileOutputStream outputStream = new FileOutputStream("/home/codekul/Desktop/name/demo.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  your msg : ");
        byte[] bytes = scanner.nextLine().getBytes();
        outputStream.write(bytes);
        outputStream.close();

        FileInputStream inputStream;
        inputStream = new FileInputStream("/home/codekul/Desktop/name/demo.txt");
        int i = 0;
        while ((i = inputStream.read()) != -1) {
            System.out.print((char) i);
        }

    }

}
