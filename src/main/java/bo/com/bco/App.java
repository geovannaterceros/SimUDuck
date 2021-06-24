package bo.com.bco;

import bo.com.bco.Clases.*;
import bo.com.bco.Behaviors.FlyRocketPowerd;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowerd());
        System.out.println("\n");

        Duck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.performFly();
        mallarDuck.performQuack();
        mallarDuck.swim();
        System.out.println("\n");

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performFly();
        redheadDuck.performQuack();
        redheadDuck.swim();

        System.out.println("\n");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();
        System.out.println("\n");

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.swim();
    }
}
