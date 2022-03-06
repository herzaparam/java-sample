package sample.app;

import sample.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();
        category.setId("ID");
        category.setId(null);
        category.setExpensive(true);
        System.out.println(category.getId());
        System.out.println(category.isExpensive());

    }
}
