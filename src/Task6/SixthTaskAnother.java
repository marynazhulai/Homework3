package Task6;

public class SixthTaskAnother {

    public static void main(String[] args) {
        String a = "hop";
        String b = "hello";

        String result = a.length() < b.length() ? a + b + a : b + a + b;
        System.out.println(result);
    }
}
