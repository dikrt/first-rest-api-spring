package pl.edu.vistula.firstrestapispring.product.api.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.vistula.firstrestapispring.product.api.Request.ProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.response.ProductResponse;
import pl.edu.vistula.firstrestapispring.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pl.edu.vistula.firstrestapispring.product.api.Request.UpdateProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.Request.ProductRequest;
import pl.edu.vistula.firstrestapispring.product.service.ProductService;
import org.springframework.web.bind.annotation.PutMapping;
import pl.edu.vistula.firstrestapispring.product.api.Request.UpdateProductRequest;


@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;
    private UpdateProductRequest updateProductRequest;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete product")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest) {
        ProductResponse productResponse = productService.create(productRequest);
        return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    @Operation(summary = "Find product by id")
    public ResponseEntity<ProductResponse> find(@PathVariable Long id) {
        ProductResponse productResponse = productService.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }
    @PutMapping("/{id}")
    @Operation(summary = "Update product")
    public ResponseEntity<ProductResponse> update(@PathVariable Long id, @RequestBody UpdateProductRequest UpdateProductRequest) {
        ProductResponse productResponse = productService.update(id, updateProductRequest);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }
}

