package lab7.task3.q1_2;

public class Rewind implements State{
    private RemoteDevice remote;

    public Rewind(RemoteDevice remote){
        this.remote = remote;
    }

    public boolean pressPlay(){
        System.out.println("The player is now playing");
        remote.setState(remote.getPlayingState());
        remote.setPosition(remote.getPosition()+1);
        return true;
    }

    public boolean pressPause(){
        System.out.println("The player pressed pause --> change to pause state");
        remote.setState(remote.getPausedState());
        return true;
    }

    @Override
    public boolean pressStop() {
        System.out.println("The player press stop");
        remote.setState(remote.getStoppedState());
        remote.setPosition(0);
        return true;
    }

    @Override
    public boolean pressRewind() {
        System.out.println("The player is continue pressing rewind");

        return false;
    }
}
