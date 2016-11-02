package example.from.my.mind;


public class BridgePatternMain {
	public static void main(String[] args){
		Environment australiaKangaroo = new Australia(new Kangaroo());
		Environment australiaJaguar = new Australia(new Jaguar());
		Environment africaKangaroo = new Africa(new Kangaroo());
		Environment africaJaguar = new Africa(new Jaguar());
		
		australiaKangaroo.environmentPolutionStatus();
		australiaKangaroo.someAnimalEats();
		australiaKangaroo.someAnimalMoves();
		
		australiaJaguar.environmentPolutionStatus();
		australiaJaguar.someAnimalEats();
		australiaJaguar.someAnimalMoves();
		
		africaKangaroo.environmentPolutionStatus();
		africaKangaroo.someAnimalEats();
		africaKangaroo.someAnimalMoves();
		
		africaJaguar.environmentPolutionStatus();
		africaJaguar.someAnimalEats();
		africaJaguar.someAnimalMoves();
	}
}
