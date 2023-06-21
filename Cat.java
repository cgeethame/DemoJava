package geethaprograms;

public class Cat extends Animal{
	public void sleep()
	{
		System.out.println("cat is sleeping");
	}

	public static void main(String[] args) {
		Cat obj1=new Cat();
		obj1.sleep();
		obj1.run();
		
	}

}
