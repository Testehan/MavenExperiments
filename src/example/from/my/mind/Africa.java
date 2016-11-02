package example.from.my.mind;


public class Africa extends Environment{

	public Africa(Animal animal) {
		super(animal);
	}

	@Override
	public void environmentPolutionStatus() {
		System.out.println("Africa looks pretty good, however the hunting is kind of bad");
		
	}

}
