public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person (String name, String address) {
        this.name = name;
        this.address = address;
    }
    Person (String paramName) {
        this(paramName, null);
    }

    void sayHello(String name){
        System.out.println("Halo" + " " + name + " " + "nama saya" + " " + this.name + " " +address);
    }
}
class People extends Person {
    People(String name, String address) {
        super(name, address);
    }
}
