package lab2.task1.pull;

public class BabyMonitorSimple implements Observer {

	private Baby mdata;
	private String name;
	private String location;
	private boolean crying;

	public BabyMonitorSimple(String location, Baby d) {
		this.mdata = d;
		this.location = location;
		mdata.registerObserver(this);
	}

	public void display() {
		if (crying) {
			System.out.println("Monitor:" + mdata.getName() + " baby is crying at location: " + location);
		}
	}

	public void turnOff() {
		mdata.removeObserver(this);
	}

	public void update() {
		this.name = mdata.getName();
		this.crying = mdata.getCrying();
		display();
	}

}
