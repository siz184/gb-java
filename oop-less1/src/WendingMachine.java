import java.util.ArrayList;
import java.util.List;

public class WendingMachine {

    public List<Product> getProducts() {
        return products;
    }

    private List<Product> products = new ArrayList<>();
    public WendingMachine addProduct(Product product){
        this.products.add(product);
        return this;
    }

    public Product findProduct(String name){
        for(Product prod : getProducts()){
            if(prod.getName().equals(name)){
                return prod;
            }
        }
        return null;
    }

}
