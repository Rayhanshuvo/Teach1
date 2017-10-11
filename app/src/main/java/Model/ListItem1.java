package Model;

/**
 * Created by ray on 10/11/2017.
 */

public class ListItem1 {

    private String name;
    private String description;

    public ListItem1(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
