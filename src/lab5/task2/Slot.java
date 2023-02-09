package lab5.task2;

public abstract class Slot {
	
	String name = "stub slot";
	Cabinet cabinet;
	Payment payment;
	Display display;
	CPU cpu;
	OS os;
	
	abstract void build();
	
	void collectParts() {
		System.out.println("fetching components:");
	}
	void assembleParts() {
		System.out.println("assembling components");
	}
	void test(String type) {
		if (type.equals("hardware")) System.out.println("testing hardware");
		else System.out.println("testing software");
	}
	void uploadSoftware() {
		System.out.println("uploading software:" + os);
	}
	void ship() {
		System.out.println("wrapping the slot machine in Ceram Wrap and shipping it with UPS");
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}

	public String toString() {
		String result = "";
		result = String.format(
			"name: %s \ncabinet: %s \npayment: %s \ndisplay: %s \ncpu: %s \nos: %s \n",
			this.name,
			this.cabinet.toString(),
			this.payment.toString(),
			this.display.toString(),
			this.cpu.toString(),
			this.os.toString());

		return result;
	}
}