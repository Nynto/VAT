import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectIO {

    public static void writeFormFile(ArrayList<Form> forms) {
        try {
            FileOutputStream f = new FileOutputStream(new File("forms.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(forms);

            o.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public static ArrayList<Form> readFormFile() {
        ArrayList<Form> forms = new ArrayList<>();
        try {
            FileInputStream f = new FileInputStream(new File("forms.txt"));
            ObjectInputStream o = new ObjectInputStream(f);

            ArrayList<Form> formsFromFile = (ArrayList<Form>) o.readObject();
            forms.addAll(formsFromFile);

            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return forms;
    }
}