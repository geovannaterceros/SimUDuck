package bo.com.bco.Clases;

import bo.com.bco.Behaviors.FlyNoWay;
import bo.com.bco.Behaviors.MuteQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display(){
        System.out.println("Soy un pato DecoyDuck");
    }

}
