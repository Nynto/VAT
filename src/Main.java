import java.util.ArrayList;
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

        Block eerste = new Block(1, 5.7, 3.45, 3.2746832);
        Block tweede = new Block(2, 6.7, 3.45, 3.2746832);
        Block derde = new Block(3, 7.7, 3.45, 3.2746832);
        Block vierde = new Block(4, 8.7, 3.45, 3.2746832);
        Block vijfde = new Block(5, 9.7, 3.45, 3.2746832);
        Block zesde = new Block(6, 10.7, 3.45, 3.2746832);

        ArrayList<Block> blocks = new ArrayList<>();

        blocks.add(eerste);
        blocks.add(tweede);
        blocks.add(derde);
        blocks.add(vierde);
        blocks.add(vijfde);
        blocks.add(zesde);

        ObjectIO.writeBlockFile(blocks);

        Cone eersteCone = new Cone(1, 5.7, 3.45);
        Cone tweedeCone = new Cone(2, 5.7, 3.45);

        ArrayList<Cone> cones = new ArrayList<>();

        cones.add(eersteCone);
        cones.add(tweedeCone);

        ObjectIO.writeConeFile(cones);

        Cylinder eersteCyl = new Cylinder(1, 5.7, 3.45);
        Cylinder tweedeCyl = new Cylinder(2, 5.7, 3.45);

        ArrayList<Cylinder> cylinders = new ArrayList<>();

        cylinders.add(eersteCyl);
        cylinders.add(tweedeCyl);

        ObjectIO.writeCylinderFile(cylinders);

        Pyramid eerstePyr = new Pyramid(1, 5.7, 3.45, 10);

        ArrayList<Pyramid> pyramids = new ArrayList<>();

        pyramids.add(eerstePyr);

        ObjectIO.writePyramidFile(pyramids);

        Sphere eersteSp = new Sphere(1, 5.7);
        Sphere tweedeSp = new Sphere(2, 5.7);

        ArrayList<Sphere> spheres = new ArrayList<>();

        spheres.add(eersteSp);
        spheres.add(tweedeSp);

        ObjectIO.writeSphereFile(spheres);

        ArrayList<Block> infoUitFile = ObjectIO.readBlockFile();

        for (Block block : infoUitFile) {
            System.out.println(block.getId());
        }

        ArrayList<Cone> conesUitFile = ObjectIO.readConeFile();

        for (Cone cone : conesUitFile) {
            System.out.println(cone.getId());
        }

        ArrayList<Cylinder> cylindersUitFile = ObjectIO.readCylinderFile();

        for (Cylinder cylinder : cylindersUitFile) {
            System.out.println(cylinder.getId());
        }

//        SQL.addBlock(eerste);
//        SQL.addBlock(tweede);
//        SQL.addBlock(derde);
//        SQL.addBlock(vierde);
//        SQL.addBlock(vijfde);
//        SQL.addBlock(zesde);
//
//        List<Block> blocks = SQL.readBlocks();
//
//        for (Block block : blocks) {
//            System.out.println(block.calculateVolume());
//        }
//
//        for (Block block : blocks) {
//            SQL.deleteBlock(block);
//        }
//
//        for (Block block : blocks) {
//            System.out.println(block.calculateVolume());
//        }
    }
}