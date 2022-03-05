package sample.app;

import sample.data.Product;

public class App {
    public static void main(String[] args) {
        Product product = new Product("kursi", 3_000);
        System.out.println(product.name);
    }
}
