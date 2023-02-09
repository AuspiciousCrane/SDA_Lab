package lab5.task2;


public class ProgressiveSlot extends Slot {
	SlotComponentFactory componentFactory;
	
	public ProgressiveSlot(SlotComponentFactory componentFactory) {
		this.componentFactory= componentFactory;
	}

	@Override
	void build() {
		this.cabinet = componentFactory.createCabinet();
		this.payment = componentFactory.createPayment();
		this.display = componentFactory.createDisplay();
		this.cpu = componentFactory.createCPU();
		this.os = componentFactory.createOS();
	}
 
}
