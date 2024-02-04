public class TheBat extends Mammals{
	private int energy = 300;
	
	// Constructor
	public TheBat(int energy) {
		super(energy);
		this.energy = 300;
	}
	
	// Methods
	
	public void fly() {
	System.out.println("the bat is airbon");
	setEnergy(this.getEnergy()-50);
	}
	
	public void eatHumans() {
		System.out.println ("the bat's satisfaction");
		setEnergy(this.getEnergy()+25);
	}{}
	
	public void attackTown(){
		System.out.println("the bat's attack");
		setEnergy(this.getEnergy()-100);
	
	}
	
	// Getters and Setters

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
}