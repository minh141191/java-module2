package day16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteATextFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Demo.txt"));
            writer.write("12345");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
