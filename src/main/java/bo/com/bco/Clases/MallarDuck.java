package bo.com.bco.Clases;

import bo.com.bco.Interfaces.Flyable;
import bo.com.bco.Interfaces.Quackable;
import bo.com.bco.Interfaces.FlyBehavior;

public class MallarDuck extends Duck implements Flyable, Quackable{

    @Override
    public void display(){
        System.out.println("Soy un pato MallaDuck");
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
