package Task8;

import java.util.Arrays;

public class EighthTask {
    public static void main(String[] args) {
        String a = "Den, John, Will, Kate, Adam, Robin";
        String[] result;
        result = a.split(", ");
        for (String name : result) {
            System.out.println(name);
        }
    }
}
