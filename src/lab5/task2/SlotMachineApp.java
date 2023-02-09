package lab5.task2;

public class SlotMachineApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SlotFactory njFactory = new NJSlotFactory();
		// SlotFactory nvFactory = new NVSlotFactory();
		// Slot slot = njFactory.orderSlot("bonus");	
		// System.out.println("Taj Mahal ordered a " + slot + "\n");
		// Slot slot2 = nvFactory.orderSlot("progressive");	
		// System.out.println("Peppermill ordered a " + slot2 + "\n");

		SlotFactory nvFactory = new NVSlotFactory();
		Slot straightNVSlot = nvFactory.orderSlot("straight");
		System.out.println("Alice ordered: ");
		System.out.println(straightNVSlot.toString());

		Slot progressiveNVSlot = nvFactory.orderSlot("progressive");
		System.out.println("Bob ordered: ");
		System.out.println(progressiveNVSlot);


		

	}
}
