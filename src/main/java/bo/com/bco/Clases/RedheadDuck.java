package bo.com.bco.Clases;

import bo.com.bco.Clases.Behaviors.FlyWithWings;
import bo.com.bco.Clases.Behaviors.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display(){
        System.out.println("Soy un pato RedheadDuck");
    }
}
