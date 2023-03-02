public class Main {
    public static void main(String[] args) {

        WendingMachine store = new WendingMachine();

        store.addProduct(new Product("Lays",130.00))
            .addProduct(new Product("Lays1",131.00))
            .addProduct(new Product("Lays2",132.00))
            .addProduct(new CursedProducts("Milk",136.00, 7))
            .addProduct(new Drinks("Fanta",80.00, 0.33));

        System.out.println(store.toString());
        //System.out.println(store.findProduct("Lays"));
        store.buy("Lays",130.00);
        System.out.println("We bought Lays");
        System.out.println(store.toString());
        System.out.println(store.getMoney());

    }
}