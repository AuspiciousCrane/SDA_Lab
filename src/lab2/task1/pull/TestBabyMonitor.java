package lab2.task1.pull;

public class TestBabyMonitor {
public static void main(String[] args) {
        Baby marla = new Baby("marla");
        BabyMonitorSimple kitchen = new BabyMonitorSimple("kitchen ");
        marla.addObserver(kitchen);
        marla.setData(true, 1);
        marla.setData(true, 2);
    }
}

