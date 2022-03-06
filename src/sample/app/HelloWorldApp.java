package sample.app;

import sample.data.HelloWorld;

import java.sql.SQLOutput;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld(){
            public void sayHello() {
                System.out.println("Halo");
            }

            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        helloWorld.sayHello();
        helloWorld.sayHello("herza");
    }
}
