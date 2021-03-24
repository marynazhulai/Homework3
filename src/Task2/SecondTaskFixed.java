package Task2;

public class SecondTaskFixed {

    public static String getSubstring(String initialString) {
        if (initialString == null) return "";

        if (initialString.length() < 2) {
            return initialString;
        } else {
            return initialString.substring(0, 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(getSubstring(""));
        System.out.println(getSubstring("Q"));
        System.out.println(getSubstring("QA"));
        System.out.println(getSubstring("TX-TEST"));
    }
}
