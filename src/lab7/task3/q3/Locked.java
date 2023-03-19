package lab7.task3.q3;

public class Locked implements State{
    private RemoteDevice remote;

    public Locked(RemoteDevice remote){
        this.remote = remote;
    }

    @Override
    public boolean pressPlay() {
        System.out.println("Nothing happen, press play during lock");

        return true;
    }

    @Override
    public boolean pressPause() {
        System.out.println("Nothing happen, press pause during lock");
        
        return true;
    }

    @Override
    public boolean pressStop() {
        System.out.println("Nothing happen, press stop during lock");
    
        return true;
    }

    @Override
    public boolean pressRewind() {
        System.out.println("Nothing happen, press rewind during lock");
        
        return true;
    }

    @Override
    public boolean pressLock(){
        System.out.println("Unlocking the buttons, press lock during locked");
        this.remote.setState(remote.getPreviousState());
        return true;
    }    
    
}
