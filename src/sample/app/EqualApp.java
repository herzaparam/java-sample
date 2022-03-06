package sample.app;

import org.w3c.dom.ls.LSOutput;

public class EqualApp {

    public static void main(String[] args) {
        String first = "herza";
        first = first + " " + "parama";
        String second = "herza parama";
        String third = "herza parama";

        System.out.println(first);
        System.out.println(second);
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}
