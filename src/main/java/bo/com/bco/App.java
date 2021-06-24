package bo.com.bco;

import bo.com.bco.Clases.DecoyDuck;
import bo.com.bco.Clases.MallarDuck;
import bo.com.bco.Clases.RedheadDuck;
import bo.com.bco.Clases.RubberDuck;

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
        mallarDuck.performFly();
        mallarDuck.performQuack();
        mallarDuck.swim();
        System.out.println("\n");

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performFly();
        redheadDuck.performQuack();
        redheadDuck.swim();

        System.out.println("\n");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();
        System.out.println("\n");

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.swim();
    }
}
