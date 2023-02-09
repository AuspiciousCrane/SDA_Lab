package lab5.task2;


public class NVSlotComponentFactory implements SlotComponentFactory {

	@Override
	public Cabinet createCabinet() {
		return new LargeCabinet();
	}

	@Override
	public Payment createPayment() {
		return null;
	}

	@Override
	public Display createDisplay() {
		return new LCD();
	}

	@Override
	public CPU createCPU() {
		return null;
	}

	@Override
	public OS createOS() {
		return null;
	}
}
