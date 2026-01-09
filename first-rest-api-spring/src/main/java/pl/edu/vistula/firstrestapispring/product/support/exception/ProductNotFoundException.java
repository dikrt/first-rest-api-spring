package pl.edu.vistula.firstrestapispring.product.support.exception;
import pl.edu.vistula.firstrestapispring.product.support.exception.ProductNotFoundException;
import java.util.function.Supplier;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super(String.format("Product with %d not found", id));
    }
}
