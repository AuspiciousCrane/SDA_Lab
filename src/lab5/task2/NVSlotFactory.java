package lab5.task2;


public class NVSlotFactory extends SlotFactory {

	protected Slot makeSlot(String item) {

		Slot slot=null;
		SlotComponentFactory componentFactory;

		if (item.equals("straight")) {
			componentFactory = new NVStraightSlotComponentFactory();
			slot = new StraightSlot(componentFactory);
			slot.setName("NV Straight slot");
		}
		else if (item.equals("progressive")) {
			componentFactory = new NVProgressiveSlotComponentFactory();
			slot = new ProgressiveSlot(componentFactory);
			slot.setName("NV Progressive slot");
		}
		return slot;
	}
}