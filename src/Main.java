import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Cone eersteCone = new Cone(1, 5, 3);
//        double volume = eersteCone.calculateVolume();
//        System.out.println(volume);
//
//        Cylinder eersteCylinder = new Cylinder(2, 5, 3);
//        double volume2 = eersteCylinder.calculateVolume();
//        System.out.println(volume2);
//
//        Pyramid eerstePyramid = new Pyramid(4, 5, 3, 3);
//        double volume4 = eerstePyramid.calculateVolume();
//        System.out.println(volume4);
//
//        Sphere eersteSphere = new Sphere(1, 5);
//        double volume5 = eersteSphere.calculateVolume();
//        System.out.println(volume5);
//
//        Block eersteBlock = new Block(4, 5.7, 3.45, 3.2746832);
//        double volume3 = eersteBlock.calculateVolume();
//        System.out.println(volume3);

        List<Block> blocks = SQL.readBlocks();
        List<Sphere> spheres = SQL.readSpheres();

        for (Block block : blocks) {
            System.out.println(block.calculateVolume());
        }

        for (Sphere sphere : spheres) {
            System.out.println(sphere.calculateVolume());
        }
    }
}