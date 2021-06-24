package bo.com.bco.Clases;

import bo.com.bco.Interfaces.Quackable;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void display(){
        System.out.println("Soy un pato RubberDuck");
    }

    @Override
    public void quack() {
        System.out.println("Puedo chirriar");
    }
}
