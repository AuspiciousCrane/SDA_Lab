package lab4.task1;

public abstract class EggDish {

    public abstract void prepare();
    public abstract void cook();

    public final void makeDish(int eggAmount){
        crackEgg(eggAmount);
        prepare();
        cook();
        serve();
    }

    public void crackEgg(int eggAmount){
        System.out.println("Crack " + eggAmount + " eggs");
    }

    public void serve(){
        System.out.println("Serve egg onto the plate");
    }
}
