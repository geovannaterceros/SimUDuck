package bo.com.bco.Clases;

import bo.com.bco.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    public void quack(){
        System.out.println("No puedo graznar");
    }
}
