package ninth;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "Zhangsan";
        s.gender = "male";
        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(s);
            out.close();
            System.out.println("对象已储存");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
