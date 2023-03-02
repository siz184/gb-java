public class CursedProducts extends Product{
    private Integer longevity;
    public CursedProducts(String name, Double price, Integer longevity){
        super(name,price);
        this.longevity = longevity;
    }

    public String toString(){
        return String.format("%s %d",super.toString(), longevity);
    }
}
