package sample.app;

import static sample.data.Application.PROCESSOR;
import static sample.data.Constant.*;
import sample.data.Country;
import static sample.utils.MathUtils.sum;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                sum(1,1,1,1)
        );
        Country.City city = new Country.City();
        city.setName("indonesia");
        System.out.println(city.getName());
        System.out.println(PROCESSOR);
    }
}
