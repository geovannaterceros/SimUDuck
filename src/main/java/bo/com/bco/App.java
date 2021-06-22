package bo.com.bco;

import bo.com.bco.clases.MallarDuck;
import bo.com.bco.clases.RedheadDuck;

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
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
    }
}
