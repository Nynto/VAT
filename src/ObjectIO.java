import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectIO {

    public static void writeBlockFile(ArrayList<Block> blocks) {
        try {
            FileOutputStream f = new FileOutputStream(new File("blockObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(blocks);

            o.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public static ArrayList<Block> readBlockFile() {
        ArrayList<Block> blocks = new ArrayList<>();
        try {
            FileInputStream f = new FileInputStream(new File("blockObjects.txt"));
            ObjectInputStream o = new ObjectInputStream(f);

            ArrayList<Block> blocksFromFile = (ArrayList<Block>) o.readObject();
            for (Block block : blocksFromFile) {
                blocks.add(block);
            }

            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return blocks;
    }

    public static void writeConeFile(ArrayList<Cone> cones) {
        try {
            FileOutputStream f = new FileOutputStream(new File("coneObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(cones);

            o.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public static ArrayList<Cone> readConeFile() {
        ArrayList<Cone> cones = new ArrayList<>();
        try {
            FileInputStream f = new FileInputStream(new File("coneObjects.txt"));
            ObjectInputStream o = new ObjectInputStream(f);

            ArrayList<Cone> conesFromFile = (ArrayList<Cone>) o.readObject();
            for (Cone cone : conesFromFile) {
                cones.add(cone);
            }

            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return cones;
    }

    public static void writeCylinderFile(ArrayList<Cylinder> cylinders) {
        try {
            FileOutputStream f = new FileOutputStream(new File("cylinderObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(cylinders);

            o.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public static ArrayList<Cylinder> readCylinderFile() {
        ArrayList<Cylinder> cylinders = new ArrayList<>();
        try {
            FileInputStream f = new FileInputStream(new File("cylinderObjects.txt"));
            ObjectInputStream o = new ObjectInputStream(f);

            ArrayList<Cylinder> cylindersFromFile = (ArrayList<Cylinder>) o.readObject();
            for (Cylinder cylinder : cylindersFromFile) {
                cylinders.add(cylinder);
            }

            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return cylinders;
    }

    public static void writePyramidFile(ArrayList<Pyramid> pyramids) {
        try {
            FileOutputStream f = new FileOutputStream(new File("pyramidObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(pyramids);

            o.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public static ArrayList<Pyramid> readPyramidFile() {
        ArrayList<Pyramid> pyramids = new ArrayList<>();
        try {
            FileInputStream f = new FileInputStream(new File("pyramidObjects.txt"));
            ObjectInputStream o = new ObjectInputStream(f);

            ArrayList<Pyramid> pyramidsFromFile = (ArrayList<Pyramid>) o.readObject();
            for (Pyramid pyramid : pyramidsFromFile) {
                pyramids.add(pyramid);
            }

            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return pyramids;
    }

    public static void writeSphereFile(ArrayList<Sphere> spheres) {
        try {
            FileOutputStream f = new FileOutputStream(new File("sphereObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(spheres);

            o.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public static ArrayList<Sphere> readSphereFile() {
        ArrayList<Sphere> spheres = new ArrayList<>();
        try {
            FileInputStream f = new FileInputStream(new File("sphereObjects.txt"));
            ObjectInputStream o = new ObjectInputStream(f);

            ArrayList<Sphere> spheresFromFile = (ArrayList<Sphere>) o.readObject();
            for (Sphere sphere : spheresFromFile) {
                spheres.add(sphere);
            }

            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return spheres;
    }
}