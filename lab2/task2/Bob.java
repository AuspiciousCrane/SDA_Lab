package task2;

public class Bob {
    private Mood bobMood;

    public void setBobMood(Mood bobMood) {
        this.bobMood = bobMood;
    }

    public Mood getBobMood() {
        return bobMood;
    }

    @Override
    public String toString(){
        return getBobMood().mood();
    }
}
