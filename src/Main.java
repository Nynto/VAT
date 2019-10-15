public class Main {

    public static void main(String[] args) {
        Cone eersteCone = new Cone("testCone", 5, 3);
        double volume = eersteCone.calculateVolume();
        System.out.println(volume);

        Cylinder eersteCylinder = new Cylinder("testCylinder", 5, 3);
        double volume2 = eersteCylinder.calculateVolume();
        System.out.println(volume2);

        Block eersteBlock = new Block("testBlock", 5, 3, 3);
        double volume3 = eersteBlock.calculateVolume();
        System.out.println(volume3);

        Pyramid eerstePyramid = new Pyramid("testPyramid", 5, 3, 3);
        double volume4 = eerstePyramid.calculateVolume();
        System.out.println(volume4);

        Sphere eersteSphere = new Sphere("testSphere", 5);
        double volume5 = eersteSphere.calculateVolume();
        System.out.println(volume5);
    }
}