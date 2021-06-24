package bo.com.bco.Clases;

import bo.com.bco.Interfaces.Flyable;
import bo.com.bco.Interfaces.Quackable;

public class RedheadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display(){
        System.out.println("Soy un pato RedheadDuck");
    }

    @Override
    public void fly() {
        System.out.println("Puedo volar");
    }

    @Override
    public void quack() {
        System.out.println("Puedo graznar");
    }
}
