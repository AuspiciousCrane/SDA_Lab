package lab5.task2;

public class WSBonusSlotComponentFactory implements SlotComponentFactory {

    @Override
    public Cabinet createCabinet() {
        return new MediumCabinet();
    }

    @Override
    public Payment createPayment() {
        return new TicketInTicketOut();
    }

    @Override
    public Display createDisplay() {
        return new VGA();
    }

    @Override
    public CPU createCPU() {
        return new ARM();
    }

    @Override
    public OS createOS() {
        return new Symbian();
    }

}