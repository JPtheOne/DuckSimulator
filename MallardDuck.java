public class MallardDuck extends Duck{
    public MallardDuck(){
        qb = new Quack();
        fb = new Fly();
    }

    public void display(){
        System.out.println("\n I'm a Mallard");
    }
}