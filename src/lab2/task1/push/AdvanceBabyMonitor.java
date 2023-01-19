package lab2.task1.push;

import java.util.Observable;
import java.util.Observer;
import lab2.task1.push.*;

public class AdvanceBabyMonitor implements Observer{

    private String location;

    AdvanceBabyMonitor(String inLocation){
        this.location = inLocation;
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        Baby baby = (Baby)arg0;
        display(baby);
    }

    public void display(Baby baby){
        if(baby.isCrying()){
            System.out.println("AdvanceBabyMonitor: Location: " + location + " BabyName: " + baby.getName() + " crying at level" + baby.getCryingLevel());
        }
    }
}
