package example.com.adminpanel;

public class Model {
    private String imageUrl;
    private String productPrice;
    private String product;

    public Model() {
    }

    public Model(String imageUrl, String productPrice, String product) {
        this.imageUrl = imageUrl;
        this.productPrice = productPrice;
        this.product = product;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
