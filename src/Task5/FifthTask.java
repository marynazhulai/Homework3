package Task5;

public class FifthTask {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJK";
        str = str.toLowerCase();
        for (int a = 0; a < str.length(); a++) {
            if (str.charAt(a) != 97 && str.charAt(a) != 101 && str.charAt(a) != 105 && str.charAt(a) != 111 && str.charAt(a) != 117 && str.charAt(a) != 121) {
                System.out.print(str.charAt(a));
            }
        }
    }
}
