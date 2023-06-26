package stringexamples;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("hello\t") ;
            s1.append("java");
            s1.insert(5,'o') ;
            s1.delete(2,4);
            s1.reverse() ;

        System.out.println(s1);
    }
}
