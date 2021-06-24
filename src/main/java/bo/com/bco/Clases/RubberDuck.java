package bo.com.bco.Clases;

import bo.com.bco.Clases.Behaviors.FlyNoWay;
import bo.com.bco.Clases.Behaviors.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display(){
        System.out.println("Soy un pato RubberDuck");
    }
}
