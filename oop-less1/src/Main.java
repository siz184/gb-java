public class Main {
    public static void main(String[] args) {

        WendingMachine store = new WendingMachine();

        store.addProduct(new Product("Lays",130.01))
            .addProduct(new Product("Lays1",131.01))
            .addProduct(new Product("Lays2",132.01))
            .addProduct(new CursedProducts("Milk",136.00, 7))
            .addProduct(new Drinks("Fanta",80.00, 0.33));

        System.out.println(store.toString());
        if(store.buy("Lays",130.01)!=null){
            System.out.println("We bought Lays");
            System.out.println(store.toString());
        }
        if(store.buy("Fanta",80.00)!=null){
            System.out.println("We bought Fanta");
            System.out.println(store.toString());
        }

    }
}