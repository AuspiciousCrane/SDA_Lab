package lab2.task1.pull;

import java.util.Observable;
import java.util.Observer;
import lab2.task1.pull.Baby;

public class BabyMonitorSimple implements Observer {

	private String location;

	BabyMonitorSimple(String location) {
		this.location = location;
	}

	public void display(Baby baby) {
		if (baby.getCrying()) {
			System.out.println("Monitor:" + baby.getName() + " baby is crying at location: " + location + " Level: " + baby.getLevel());
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		Baby baby = (Baby)arg0;
		display(baby);
	}

}
