package geethaprograms;
interface ballet
{
public void balletDance();
}
interface folk{
	
public void folkDance();
}


public class InterfaceProgram implements ballet,folk
{
	public void balletDance()
	{
		System.out.println("Kids are performing ballet dance in the school");
	}
	public void folkDance()
	{
		System.out.println("Kids are performing folk dance in the school");
	}

	public static void main(String[] args) {
		InterfaceProgram obj=new InterfaceProgram();
		obj.balletDance();
		obj.folkDance();
	}

}
