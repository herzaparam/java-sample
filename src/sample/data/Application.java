package sample.data;

public class Application {
    public static final int PROCESSOR;
    static {
        System.out.println("mengakses class app");
        PROCESSOR = Runtime.getRuntime().availableProcessors();

    }
}
