package vat;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQL {

    private static String url = "jdbc:mysql://localhost:3306/vat";
    private static String user = "root";
    private static String password = "";

    public static ArrayList<Form> readForms()  {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        ArrayList<Form> forms = new ArrayList<>();
        PreparedStatement statement = null;

        try {
            statement = dbc.getConnection().prepareStatement("SELECT * FROM vat.form;");
            ResultSet res = dbc.select(statement);
            while(res.next()){
                String type = res.getString("type");

                switch (type) {
                    case "block":
                        Form block = new Block(
                                res.getDouble("length"),
                                res.getDouble("width"),
                                res.getDouble("height")
                        );
                        forms.add(block);
                        break;
                    case "cone":
                        Form cone = new Cone(
                                res.getDouble("radius"),
                                res.getDouble("height")
                        );
                        forms.add(cone);
                        break;
                    case "cylinder":
                        Form cylinder = new Cylinder(
                                res.getDouble("radius"),
                                res.getDouble("height")
                        );
                        forms.add(cylinder);
                        break;
                    case "pyramid":
                        Form pyramid = new Pyramid(
                                res.getDouble("length"),
                                res.getDouble("width"),
                                res.getDouble("height")
                        );
                        forms.add(pyramid);
                        break;
                    case "sphere":
                        Form sphere = new Sphere(
                                res.getDouble("radius")
                        );
                        forms.add(sphere);
                        break;
                }
            }
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return forms;
    }

    public static void addForms(ArrayList<Form> forms) {
        deleteForms();
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        for (Form form : forms) {
            PreparedStatement statement = null;
            try {
                statement = dbc.getConnection().prepareStatement("INSERT INTO vat.form (`type`, `length`, `width`, `height`, `radius`) VALUES (?, ?, ?, ?, ?);");
                statement.setString(1, form.getType());
                statement.setDouble(2, form.getLength());
                statement.setDouble(3, form.getWidth());
                statement.setDouble(4, form.getHeight());
                statement.setDouble(5, form.getRadius());
                dbc.insert(statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        dbc.closeConnection();
    }

    public static void deleteForms() {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.connectToDatabase(url,user,password);

        PreparedStatement statement = null;
        try {
            statement = dbc.getConnection().prepareStatement("TRUNCATE TABLE vat.form;");
            dbc.truncate(statement);
            dbc.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}