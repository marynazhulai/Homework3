package Task2;

import java.io.StringReader;

public class SecontTask {
    public static void main(String[] args) {

        String a = "Initial String";
        String b = a.substring(0, 2);
        System.out.println(b);
        if (a.length() == 0) {
            System.out.println("");
        }
        else if (a.length() < 2) {
            System.out.println(a);
        }
        else if (a.length() >= 2 ) {
            System.out.println("String is greater or equal to length 2");
        }
        else {
            System.out.println("Something else");
       }

    }
}
