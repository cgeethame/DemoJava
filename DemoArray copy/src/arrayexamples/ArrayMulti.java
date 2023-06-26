package arrayexamples;

public class ArrayMulti {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        //int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        a[0][0]=1;
        a[0][1]=2;
        a[0][2]=3;
        a[1][0]=4;
        a[1][1]=5;
        a[1][2]=6;
        a[2][0]=7;
        a[2][1]=8;
        a[2][2]=9;
        int x=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                x=a[i][j];
                System.out.print(x+"\t");
                //System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
