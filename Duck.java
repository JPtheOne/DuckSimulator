public abstract class Duck {
   protected QuackBehaviour qb; 
   protected FlyBehaviour fb;
 
    public void performQuack(){
        qb.quack();
    }

    public void performFly(){
        fb.fly();
    }

    public void setFlyBehaviour(FlyBehaviour fb){
        this.fb = fb;
     }

    public Fly getFlyBehaviour(){
        return (Fly) fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        this.qb = qb;
    }

    public Quack getQuackBehaviour(){
        return (Quack) qb;
    }

    public void showDuck(){
        display();
        performQuack();
        performFly();
        swim();

    }

    public void swim(){
        System.out.println("Every duck is able to float!");
    }

    public abstract void display();
    
}
