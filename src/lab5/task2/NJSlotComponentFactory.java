package lab5.task2;


public class NJSlotComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet() {
		return new SmallCabinet();
	}
	public Display createDisplay() {
		return new Reels();
	}
	@Override
	public Payment createPayment() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CPU createCPU() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public OS createOS() {
		// TODO Auto-generated method stub
		return null;
	}
}
