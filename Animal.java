package geethaprograms;

public class Animal {

	static int a = 50;
	int b = 20;

	public void jump() {
		System.out.println("dog is jumping");
	}
	public void walk()
	{
		System.out.println("walking");
	}

	public void run() {
		System.out.println("cat is running");
	}

	public static void main(String[] args) {
		
		System.out.println(a);
		Animal x = new Animal();
		x.run();
		x.jump();
		x.walk();
		System.out.println(x.b);
	}

}
