package bo.com.bco.Clases;

import bo.com.bco.Behaviors.FlyNoWay;
import bo.com.bco.Behaviors.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display(){

        System.out.println("Soy un pato modelo");
    }
}
