package moskalevms.controller.rest;

import moskalevms.controller.repr.ProductRepr;
import moskalevms.persistence.entity.Category;
import moskalevms.persistence.entity.Product;
import moskalevms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")

public class ProductRestController {

    private ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;

    }

    @GetMapping(value = "/all")
    public List<Product> getAllProducts(){
        return productService.findAll();
    }

    @GetMapping(value = "/{categoryId}/categoryId")
    public List<Product> getAllProductByCategoryId(@PathVariable("categoryId") Long categoryId){
        return productService.getAllByCategory_Id(categoryId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateProduct(@RequestBody ProductRepr product) {
        productService.save(product);
    }

    @DeleteMapping(value = "/{id}/id")
    public void deleteCategory(@PathVariable("id") Long id) {
        productService.delete(id);
    }

}
