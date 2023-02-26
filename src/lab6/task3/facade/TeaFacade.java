package facade;

public class TeaFacade {
    TeaInfuser infuser;
    Water water;
    TeaCup cup;
    
    public TeaFacade(TeaCup cup, Water water, TeaInfuser infuser) {
        this.cup = cup;
        this.water = water;
        this.infuser = infuser;
    }
    
    public void makeTea(String teaType) {
        Tea tea = new Tea(teaType);
        infuser.addTea(tea);
        water.boilWater(); // Reduced Boil Time to 1 sec for demonstration purposes
        cup.addWater(water);
        // cup.setSteepTime(15);
        cup.setSteepTime(3); // Reduced Steep Time for demonstration purposes
        cup.steep();
    }
}