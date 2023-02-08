package lab5.task2;

public interface SlotComponentFactory {
	public Cabinet createCabinet();
    public Payment createPayment();
    public Display createDisplay();
	public GPU createGPU();
	public OS createOS();
}
