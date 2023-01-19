package lab2.task1.push;

import lab2.task1.push.*;

public class TestBabyMonitor{
    public static void main(String args[]){
        System.out.println("Hello from TestBabyMonitor");

        Baby alice = new Baby("Alice");
        Baby bobby = new Baby("Bobby");
        Baby carla = new Baby("Carla");
        Baby david = new Baby("David");

        SimpleBabyMonitor kitchenMonitor = new SimpleBabyMonitor("Kitchen");

        alice.addObserver(kitchenMonitor);
        bobby.addObserver(kitchenMonitor);
            
        alice.setCry(true, 1);
        bobby.setCry(true, 2);

        System.out.println("Goodbye from TestBabyMonitor");
    }
}