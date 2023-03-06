public class Drinks extends Product{
    private Double capacity;
    public Drinks(String name, Double price, Double capacity){
        super(name,price);
        this.capacity = capacity;
    }

    public String toString(){
        return String.format("%s %2.2f",super.toString(), capacity);
    }
}