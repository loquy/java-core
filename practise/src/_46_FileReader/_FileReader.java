package _46_FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _FileReader {

    public static void main(String[] args) throws FileNotFoundException {
        // FileReader = read the contents of a file as a stream of characters. One bye one
        // read() returns an int value which contains the byte value
        // when read() returns -1, there is no more data to be read

        try {
            FileReader reader = new FileReader("Readme.md");
            int data = reader.read();
            while (data != -1) {
                System.out.println((char)data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
