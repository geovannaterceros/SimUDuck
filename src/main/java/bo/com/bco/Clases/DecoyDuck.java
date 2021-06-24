package bo.com.bco.Clases;

import bo.com.bco.Clases.Behaviors.FlyNoWay;
import bo.com.bco.Clases.Behaviors.FlyWithWings;
import bo.com.bco.Clases.Behaviors.MuteQuack;
import bo.com.bco.Clases.Behaviors.Quack;

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
