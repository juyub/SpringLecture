package day02.duck;

import day02.duck.fly.FlyBehavior;
import day02.duck.quack.QuackBehavior;

public abstract class Duck {
    
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    
    public abstract void displayName();
    
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
    
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
}
