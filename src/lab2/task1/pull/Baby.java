package lab2.task1.pull;

import java.util.Observable;

public class Baby extends Observable {

	private boolean crying=false;
	private int level=0;
	private String babyname;
	
	Baby(String name){
		this.babyname = name;
        this.crying = false;
	}
	
	public void setData(boolean crying, int level) {
		this.crying=crying;
		this.level=level;
		setChanged();
        notifyObservers();
	}

	public String getName(){
		return this.babyname;
	}
	public boolean getCrying(){
		return this.crying;
	}

	public int getLevel(){
		return this.level;
	}
}
