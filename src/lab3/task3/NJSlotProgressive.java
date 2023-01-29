public class NJSlotProgressive extends Slot {
	public NJSlotProgressive() {
		cost = 100;
		name="Progressive";
		software = "Windows XP";
		components.add("Small");
		components.add("bills");
		components.add("CRT");
		components.add("X86");
	}
	
	void ship() {
		System.out.println("having uncle vinnie drop it off");
	}
}
