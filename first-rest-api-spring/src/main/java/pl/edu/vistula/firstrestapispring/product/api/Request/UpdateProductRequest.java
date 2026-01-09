package pl.edu.vistula.firstrestapispring.product.api.Request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UpdateProductRequest extends ProductRequest {

    private final Long id;

    @JsonCreator
    public UpdateProductRequest(String name, Long id) {
        super(name);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
