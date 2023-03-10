package lab2.task1.push;

import java.util.Observable;
import java.util.Observer;
import lab2.task1.push.Baby;

public class SimpleBabyMonitor implements Observer{

    private String location;

    SimpleBabyMonitor(String inLocation){
        this.location = inLocation;
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        Boolean babyIsCrying = (Boolean)arg1;
        if(babyIsCrying){
            System.out.println("SimpleBabyMonitor at " + location + " baby is crying");
        }
    }

}