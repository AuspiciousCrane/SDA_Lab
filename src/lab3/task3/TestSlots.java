
public class TestSlots {
	public static void main(String[] args) {
		SlotStore NVStore = new NVSlotStore();
		SlotStore NJStore = new NJSlotStore();
		SlotStore WAStore = new WASlotStore();
		Slot slot = NVStore.orderSlot(slottype.progressive);
		System.out.println("Taj Mahal ordered a "+ slot.getName());
		slot = NJStore.orderSlot(slottype.progressive);
		System.out.println("Borgata ordered a "+ slot.getName());

		slot = WAStore.orderSlot(slottype.progressive);
		System.out.println("Rick ordered a "+ slot.getName());
	}

}
