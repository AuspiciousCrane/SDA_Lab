package lab5.task2;

public class StraightSlot extends Slot {

    SlotComponentFactory componentFactory;

    public StraightSlot(SlotComponentFactory inComponentFactory){
        this.componentFactory = inComponentFactory;
    }

    @Override
    void build() {
        this.cabinet = componentFactory.createCabinet();
        this.payment = componentFactory.createPayment();
        this.display = componentFactory.createDisplay();
        this.cpu = componentFactory.createCPU();
        this.os = componentFactory.createOS();
    }
    
}
