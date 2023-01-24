package lab2.task1.pull;
public class TestBabyMonitor {
	public static void main(String[] args) {
		Baby marla = new Baby("marla");
		BabyMonitorSimple livingRoom = new BabyMonitorSimple("kitchen ", marla);
		marla.setData(true, 1);
	}
}
