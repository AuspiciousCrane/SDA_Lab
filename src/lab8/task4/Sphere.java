package lab8.task4;



import java.util.Iterator;

public class Sphere extends Prim {
    
	private float radius;
	
	public Sphere(float r){
	  this.radius=r;
	}
	
	public void render() {
		System.out.println("Sphere R:"+ radius);
	}

	public float volume() {
		return (float) (4.0/3.0 * Math.PI*radius*radius*radius);
	}

	public Iterator createIterator() {
		return new NullIterator();
	}
	
}
