import java.util.ArrayList;
import java.util.List;

public class WendingMachine {

    public Double getMoney(){
        return money;
    }

    private Double money = 0.0;

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

    public Product buy(String name, Double price){
        Product something = findProduct(name);
        if(something == null) return null;
        if(Double.compare(price,something.getPrice()) == 0){
            products.remove(something);
            money += price;
            return something;
        }
        return null;
    }

    public String toString(){
        StringBuilder showProducts = new StringBuilder();
        for (Product prod : this.getProducts()){
            showProducts.append(prod.toString())
                    .append("\n");
        }
        showProducts.append(money);
        return showProducts.toString();
    }


}
