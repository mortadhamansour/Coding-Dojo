public class TestZoo {

	public static void main(String[] args) {	
		Gorilla gorilla1 = new Gorilla(0);
		TheBat bat1 = new TheBat(300);
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		
		gorilla1.climb();
		
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		
		bat1.fly();
		bat1.fly();
		
		bat1.eatHumans();
	}
}