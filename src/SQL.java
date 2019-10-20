import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQL {

    private static String url = "jdbc:mysql://localhost:3306/vat";
    private static String user = "root";
    private static String password = "";

    public static ArrayList<Block> readBlocks()  {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Block> blocks = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("SELECT * FROM vat.block;");
            ResultSet res = dbc.select(statement);
            while(res.next()){
                Block block = new Block(
                        res.getInt("ID"),
                        res.getDouble("length"),
                        res.getDouble("width"),
                        res.getDouble("height")
                );
                blocks.add(block);
            }
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return blocks;
    }

    public static void addBlock(Block block) {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Block> blocks = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("INSERT INTO vat.block (`ID`, `length`, `width`, `height`) VALUES (?, ?, ?, ?);");
            statement.setInt(1, block.getId());
            statement.setDouble(2, block.getLength());
            statement.setDouble(3, block.getWidth());
            statement.setDouble(4, block.getHeight());
            dbc.insert(statement);
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteBlock(Block block) {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Block> blocks = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("DELETE FROM vat.block WHERE `ID` = ?;");
            statement.setInt(1, block.getId());
            dbc.delete(statement);
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Cone> readCones()  {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Cone> cones = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("SELECT * FROM vat.cone;");
            ResultSet res = dbc.select(statement);
            while(res.next()){
                Cone cone = new Cone(
                        res.getInt("ID"),
                        res.getDouble("radius"),
                        res.getDouble("height")
                );
                cones.add(cone);
            }
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cones;
    }

    public static void addCone(Cone cone) {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Cone> cones = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("INSERT INTO vat.cone (`ID`, `radius`, `height`) VALUES (?, ?, ?);");
            statement.setInt(1, cone.getId());
            statement.setDouble(2, cone.getRadius());
            statement.setDouble(3, cone.getHeight());
            dbc.insert(statement);
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteCone(Cone cone) {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Cone> cones = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("DELETE FROM vat.cone WHERE `ID` = ?;");
            statement.setInt(1, cone.getId());
            dbc.delete(statement);
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Cylinder> readCylinders()  {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Cylinder> cylinders = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("SELECT * FROM vat.cylinder;");
            ResultSet res = dbc.select(statement);
            while(res.next()){
                Cylinder cylinder = new Cylinder(
                        res.getInt("ID"),
                        res.getDouble("radius"),
                        res.getDouble("height")
                );
                cylinders.add(cylinder);
            }
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cylinders;
    }

    public static void addCylinder(Cylinder cylinder) {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Cylinder> cylinders = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("INSERT INTO vat.cylinder (`ID`, `radius`, `height`) VALUES (?, ?, ?);");
            statement.setInt(1, cylinder.getId());
            statement.setDouble(2, cylinder.getRadius());
            statement.setDouble(3, cylinder.getHeight());
            dbc.insert(statement);
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteCylinder(Cylinder cylinder) {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Cylinder> cylinders = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("DELETE FROM vat.cylinder WHERE `ID` = ?;");
            statement.setInt(1, cylinder.getId());
            dbc.delete(statement);
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Pyramid> readPyramids()  {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Pyramid> pyramids = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("SELECT * FROM vat.pyramid;");
            ResultSet res = dbc.select(statement);
            while(res.next()){
                Pyramid pyramid = new Pyramid(
                        res.getInt("ID"),
                        res.getDouble("length"),
                        res.getDouble("width"),
                        res.getDouble("height")
                );
                pyramids.add(pyramid);
            }
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pyramids;
    }

    public static void addPyramid(Pyramid pyramid) {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Pyramid> pyramids = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("INSERT INTO vat.pyramid (`ID`, `length`, `width`, `height`) VALUES (?, ?, ?, ?);");
            statement.setInt(1, pyramid.getId());
            statement.setDouble(2, pyramid.getLength());
            statement.setDouble(3, pyramid.getWidth());
            statement.setDouble(4, pyramid.getHeight());
            dbc.insert(statement);
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletePyramid(Pyramid pyramid) {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Pyramid> pyramids = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("DELETE FROM vat.pyramid WHERE `ID` = ?;");
            statement.setInt(1, pyramid.getId());
            dbc.delete(statement);
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Sphere> readSpheres()  {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Sphere> spheres = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("SELECT * FROM vat.sphere;");
            ResultSet res = dbc.select(statement);
            while(res.next()){
                Sphere sphere = new Sphere(
                        res.getInt("ID"),
                        res.getDouble("radius")
                );
                spheres.add(sphere);
            }
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return spheres;
    }

    public static void addSphere(Sphere sphere) {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Sphere> spheres = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("INSERT INTO vat.sphere (`ID`, `radius`) VALUES (?, ?);");
            statement.setInt(1, sphere.getId());
            statement.setDouble(2, sphere.getRadius());
            dbc.insert(statement);
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteSphere(Sphere sphere) {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Sphere> spheres = new ArrayList<>();
        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("DELETE FROM vat.sphere WHERE `ID` = ?;");
            statement.setInt(1, sphere.getId());
            dbc.delete(statement);
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}