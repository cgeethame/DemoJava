package stringexamples;

public class StringExample1 {
    public static void main(String[] args) {
        String s1=new String("welcome");
        String s2="   GEETHA   ";
        char s3[]={'h','i'};
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        System.out.println(s1.length() );
        System.out.println(s1+"\t"+s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.charAt(2) );
        System.out.println(s2.replace('G','S' ));
        System.out.println(s1.toUpperCase() );
        System.out.println(s2.toLowerCase() );
        System.out.println(s1.contains("E") );
        System.out.println(s2.endsWith("HA") );
        System.out.println(s2.trim() );


    }
}
