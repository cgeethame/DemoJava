package geethaprograms;

public class ArrayProgram {
	int i=9;
	public static void main(String args[])
	{
		ArrayProgram ps2=new ArrayProgram();
		System.out.println(ps2.i);
		int[] nums= {45,78,67,89};
		int index=0;
		for(index=0;index<nums.length;index++)
		{
			System.out.println(nums[index]);
		}
		/*int nums[] = {25, 87, 69, 55};

        int index = 0;
        while (index < nums.length) {
            int num = nums[index];
            System.out.println(num);
            index++;
        }
		
		/*int a[]= new int[5];
		a[0]=23;
		a[1]=34;
		a[2]=67;
		a[3]=56;
		a[4]=100;	
		for(int i=0;i<=4;i++)
		{
			
		System.out.println(a[i]);
			
		}
		//String s="MongoDB";
		/*String s1= "java ";
		String s2=" java  ";
		char s3=s2.charAt(2);
		System.out.println(s1.length());
		System.out.println(s3);
		System.out.println(s1.replace('j', 't'));
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(s2.concat(s1));
		//String s1= new String("java");
		//String s2=new String("java");
		/*if(s1==s2)
		{
		System.out.println("true");
		}
		else
			System.out.println("false");*/
	}

}
