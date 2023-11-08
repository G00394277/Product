package ie.atu.product;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ProductService {
    private final RestTemplate restTemplate;

    public ProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    public String fetchProduct(){
        return restTemplate;
    }


}
