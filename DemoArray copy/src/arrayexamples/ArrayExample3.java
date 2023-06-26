package arrayexamples;

public class ArrayExample3 {
    public static void main(String[] args) {
        int marks[]={10,20,30,40};
        int sum=0;

        for(int i=0;i<marks.length;i++) {

                sum=sum+marks[i];
            }
            System.out.println(sum);
        }
    }

