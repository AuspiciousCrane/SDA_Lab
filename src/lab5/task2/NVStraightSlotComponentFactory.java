package lab5.task2;

public class NVStraightSlotComponentFactory implements SlotComponentFactory{

    @Override
    public Cabinet createCabinet() {
        return new LargeCabinet();
    }

    @Override
    public Payment createPayment() {
        return new TicketInTicketOut();
    }

    @Override
    public Display createDisplay() {
        return new Reels();
    }

    @Override
    public CPU createCPU() {
        return new ARM();
    }

    @Override
    public OS createOS() {
        return new Linux();
    }

}