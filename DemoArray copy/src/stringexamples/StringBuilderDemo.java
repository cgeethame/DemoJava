package stringexamples;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder  name=new StringBuilder("avatar\t") ;
        name.append("movie");
        name.insert(6,2) ;
        //name.delete(2,4);
       // name.reverse() ;

        System.out.println(name);
    }
    }

