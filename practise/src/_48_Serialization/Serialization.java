package _48_Serialization;

import java.io.*;

public class Serialization {

    public static void main(String[] args) throws IOException {
        // Serialization = the process of converting an object into a byte stream
        // Persists (saves the state) the object after program exits
        // This byte stream can be saved as a file or sent over a network
        // Can be sent to a different machine
        // Byte stream can be saved as a file (.ser) which is platform independent
        // (Think of this as if you're saving a file with the object's information)

        // Deserialization = The reverse process of converting a byte stream into an object.
        // (Think of this as if you're loading a saved file)

        User user = new User();
        user.name = "Bro Code";
        user.password = "password 123";

        user.sayHello();

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved! :)");
    }

}
