
public class NJSlotComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet() {
		return new SmallCabinet();
	}
	public Display createDisplay() {
		return new Reels();
	}
}
