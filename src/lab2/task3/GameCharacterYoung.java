package lab2.task3;

public class GameCharacterYoung extends GameCharacter {

    public GameCharacterYoung() {
        guitarBehavior = new Guitar_GibsonSG();
        soloBehavior = new Solo_JumpOffStage();
    }
    
}