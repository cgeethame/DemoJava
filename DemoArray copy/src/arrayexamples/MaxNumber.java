package arrayexamples;

public class MaxNumber {
    public static void main(String[] args) {
        int a[]={26,12,34,67,19};
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)

                max=a[i];

        }
        System.out.println("maximum: "+max);

    }
}
