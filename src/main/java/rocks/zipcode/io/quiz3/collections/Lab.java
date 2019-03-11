package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    protected String name;


    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.name =labName;


    }

    public String getName() {
        return name;
    }
}
