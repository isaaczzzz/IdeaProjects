package ninth;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        Student s = null;
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fis);
            s = (Student) in.readObject();
            in.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ID: "+s.id);
        System.out.println("Name: "+s.name);
        System.out.println("Gender: "+s.gender);
    }
}
