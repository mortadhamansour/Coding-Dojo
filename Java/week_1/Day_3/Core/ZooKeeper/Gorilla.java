
public class Gorilla extends Mammals {
	
	public Gorilla(int energy) {
		super(energy);
	}
	
	// Methods
	
	public void throwSomething() {
		System.out.println(" the gorilla has thrown something");
		setEnergy(this.getEnergy() - 5);
	}
	
	public void eatBananas() {
		
		System.out.println("gorilla's satisfaction");
		setEnergy(this.getEnergy()+5);
	}
	
	public void climb() {
		System.out.println("the gorilla has climbed a tree");
		setEnergy(this.getEnergy()-10);
		
	}
	
}