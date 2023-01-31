public class DecoyDuck extends Duck{
    public DecoyDuck(){
        qb = new MuteQuack();
        fb = new Flynot();
    }  

    public void display(){
        System.out.println(" \n I'm a Decoy");
    }
}
