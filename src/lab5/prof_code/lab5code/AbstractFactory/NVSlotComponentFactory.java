
public class NVSlotComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet() {
		return new LargeCabinet();
	}
	public Display createDisplay() {
		return new LCD();
	}
}
