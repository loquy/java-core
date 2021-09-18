package _45_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class _FileWriter {

    public static void main(String[] args) throws IOException {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \n Violets are blue \n nBooty booty booty \n Rockin' everywhere!");
            writer.append("\n(A poem by Bro)");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
