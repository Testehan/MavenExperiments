package example.from.my.mind;


public class Australia extends Environment{

	public Australia(Animal animal) {
		super(animal);
	}

	@Override
	public void environmentPolutionStatus() {
		System.out.println("Australia is in good shape as far as polution is concerned.");
	}

}
