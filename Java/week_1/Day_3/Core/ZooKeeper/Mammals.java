public class Mammals {
	
	private int energy = 100;

	public Mammals() {
		
		
	}
	
	public Mammals(int energy) {
		
		this.energy = 100;
	}
	
	// {Methods
		public void displayEnergy(){
			System.out.println( "remaining energy is :"+ this.getEnergy());
			
		}
		
	// Getters and setters
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
}