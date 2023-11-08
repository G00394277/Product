package ie.atu.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController (ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/addProduct")
    public String getProduct(){
        productService.fetchProduct();
    }

    @GetMapping("getProductById/{id]")
}
