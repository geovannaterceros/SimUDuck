package bo.com.bco.clases;

public class RubberDuck extends Duck{
    @Override
    public void quack(){
        System.out.println("Puedo chirriar");
    }

    @Override
    public void display(){
        System.out.println("Soy un pato RubberDuck");
    }

    @Override
    public void fly(){
    }
}
