package facade;
public class MakeTea {
    public static void main(String[] args) {
        TeaCup blueCup = new TeaCup();
        Water water = new Water();
        TeaInfuser infuser = new TeaInfuser();
        TeaFacade facade = new TeaFacade(blueCup, water, infuser);
        facade.makeTea("Earl Grey");
    }
}