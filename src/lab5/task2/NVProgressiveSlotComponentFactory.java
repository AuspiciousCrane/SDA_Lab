package lab5.task2;


public class NVProgressiveSlotComponentFactory implements SlotComponentFactory {

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
        return new LCD();
    }

    @Override
    public CPU createCPU() {
        return new X77();
    }

    @Override
    public OS createOS() {
        return new Andriod();
    }

}