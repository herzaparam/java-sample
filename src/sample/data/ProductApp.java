package sample.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("mac book", 30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
