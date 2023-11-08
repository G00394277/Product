package ie.atu.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductDetails {
    @JsonProperty("productId")
    private int productId;

    @JsonProperty("productName")
    private String productName;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("warehouseId")
    private int warehouseId;
}
