package example.from.my.mind;


public abstract class Environment {
	
	private Animal animal;

	public Environment(Animal animal){
		this.animal = animal;
	}
	
	public void someAnimalEats(){
		this.animal.eat();
	}

	public void someAnimalMoves(){
		this.animal.move();
	}
	
	public abstract void environmentPolutionStatus();
}
