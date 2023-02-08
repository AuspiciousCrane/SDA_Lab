package lab5.task2;


public class ProgressiveSlot extends Slot {
	SlotComponentFactory componentFactory;
	
	public ProgressiveSlot(SlotComponentFactory componentFactory) {
		this.componentFactory= componentFactory;
	}
 
	void build() {
		cabinet = componentFactory.createCabinet();
		display = componentFactory.createDisplay();
	}
}
