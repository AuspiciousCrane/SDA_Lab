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
        AdvanceBabyMonitor bedroomMonitor = new AdvanceBabyMonitor("Bedroom");

        alice.addObserver(kitchenMonitor);
        bobby.addObserver(kitchenMonitor);
        carla.addObserver(bedroomMonitor);
        david.addObserver(bedroomMonitor);
            
        alice.setCry(true, 1);
        bobby.setCry(true, 2);
        carla.setCry(true, 3);
        david.setCry(true, 4);

        System.out.println("Goodbye from TestBabyMonitor");
    }
}