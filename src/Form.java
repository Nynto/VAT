import java.io.Serializable;

public class Form implements Serializable {

    private static final long serialVersionUID = 1L;
    protected int id;

    public Form(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}