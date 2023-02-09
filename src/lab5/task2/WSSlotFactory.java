package lab5.task2;


public class WSSlotFactory extends SlotFactory {

    @Override
    Slot makeSlot(String type) {
        
        Slot slot = null;
        SlotComponentFactory componentFactory;

        if(type.equals("bonus")){
            componentFactory = new WSBonusSlotComponentFactory();
            slot = new BonusSlot(componentFactory);
            slot.setName("Washington Bonus slot");
        } 

        return slot;
    }

}