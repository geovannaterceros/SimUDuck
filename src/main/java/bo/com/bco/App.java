package bo.com.bco;

import bo.com.bco.clases.DecoyDuck;
import bo.com.bco.clases.MallarDuck;
import bo.com.bco.clases.RedheadDuck;
import bo.com.bco.clases.RubberDuck;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.quack();
        mallarDuck.fly();
        System.out.println("\n");
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.fly();
        System.out.println("\n");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.fly();
        rubberDuck.quack();
        System.out.println("\n");
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.fly();
        decoyDuck.quack();

    }
}
