package lab2.task1.push;

import java.util.Observable;

public class Baby extends Observable{
    private String name;
    private Boolean crying;
    private Integer cryingLevel;
    
    Baby(String inName){
        this.name = inName;
        this.crying = false;
        this.cryingLevel = 0;
    }

    public void setCry(Boolean inCrying, Integer inCryingLevel){
        this.crying = inCrying;
        this.cryingLevel = inCryingLevel;
        setChanged();
        notifyObservers(this.crying);
    }

    public String getName(){
        return this.name;
    }

    public Boolean isCrying(){
        return this.crying;
    }

    public Integer getCryingLevel(){
        return this.cryingLevel;
    }
    
}
