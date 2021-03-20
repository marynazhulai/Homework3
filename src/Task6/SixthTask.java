package Task6;

import javax.sound.midi.Soundbank;

public class SixthTask {
    public static void main(String[] args) {
        String a = "hop";
        String b = "hello";

        if (a.length() < b.length()) {
            String c = a + b + a;
            System.out.println(c);
        } else if (a.length() > b.length()) {
            String c = b + a + b;
            System.out.println(c);
        } else {
            System.out.println("Something else");
        }
    }
}




