package _48_Serialization;

import java.io.*;

public class Deserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user;

        FileInputStream fileIn = new FileInputStream("D:\\study\\java core\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
