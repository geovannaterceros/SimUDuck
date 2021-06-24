package bo.com.bco.Clases;

import bo.com.bco.Interfaces.FlyBehavior;
import bo.com.bco.Interfaces.QuackBehavior;

public class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void display(){}

    public void swim() {
        System.out.println("Puedo nadar");
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
