package _44_FileClass;

import java.io.File;
import java.io.IOException;

public class FileClass {

    public static void main(String[] args) throws IOException {
        // file = An abstract representation of file and directory pathnames

        File file = new File("Readme.md");
        if(file.exists()) {
            System.out.println("That file exists! :o!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.isFile());
//            file.delete();
        } else {
            System.out.println("That file doesn't exist :(");
        }

    }
}
