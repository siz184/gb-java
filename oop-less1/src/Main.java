public class Main {
    public static void main(String[] args) {

        WendingMachine store = new WendingMachine();

        store.addProduct(new Product("Lays",130.0))
            .addProduct(new Product("Lays1",131.0))
            .addProduct(new Product("Lays2",132.0))
            .addProduct(new Product("Lays3",133.0))
            .addProduct(new Product("Lays4",134.0))
            .addProduct(new Product("Lays5",135.0))
            .addProduct(new Product("Lays6",136.0))
            .addProduct(new CursedProducts("Lays6",136.0, 7))
            .addProduct(new Drinks("Fanta",80.0, 0.33));

        for (Product prod : store.getProducts()){
            System.out.println(prod);
        }

        System.out.println(store.findProduct("Lays"));

    }
}