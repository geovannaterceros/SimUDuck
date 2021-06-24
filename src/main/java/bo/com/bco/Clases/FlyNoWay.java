package bo.com.bco.Clases;
import bo.com.bco.Interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    public void fly(){
        System.out.println("No puedo volar");
    }
}
