package geethaprograms;

public class Dog extends Animal{
	public void Habit()
	{
		System.out.println("Dog is barking");
	}
	

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.Habit();
		obj.run();
		obj.jump();
	}

}
