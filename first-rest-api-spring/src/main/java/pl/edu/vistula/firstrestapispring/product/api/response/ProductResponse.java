package pl.edu.vistula.firstrestapispring.product.api.response;

public class ProductResponse {

    private final Long id;
    private final String name;

    // Constructor to initialize the data
    public ProductResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for ID
    public Long getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }
}
