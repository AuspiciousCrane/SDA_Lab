package lab4.task1.q2;

public abstract class EggDish {

    public abstract void prepare();
    public abstract void cook();
    public abstract void addSaltAndPepper();

    public final void makeDish(int eggAmount){
        crackEgg(eggAmount);
        prepare();
        cook();
        serve();
        if(customerWantsSaltAndPepper()){
            addSaltAndPepper();
        }
    }

    final void crackEgg(int eggAmount){
        System.out.println("Crack " + eggAmount + " eggs");
    }

    final void serve(){
        System.out.println("Serve egg onto the plate");
    }

    //hook method
    boolean customerWantsSaltAndPepper(){
        return true;
    }
}
