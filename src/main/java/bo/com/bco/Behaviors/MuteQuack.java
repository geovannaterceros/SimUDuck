package bo.com.bco.Behaviors;

import bo.com.bco.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    public void quack(){
        System.out.println("No puedo graznar");
    }
}
