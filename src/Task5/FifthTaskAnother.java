package Task5;

public class FifthTaskAnother {

    public static void main(String[] args) {
        String str = "ABCDEFGHIJK";
        System.out.println(replaceVowels(str));
    }

    // Вариант со стрингбилдером.
    public static String replaceVowels(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (!("aouei".contains("" + c))) {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Вариант с regexp
    public static String replaceVowelsRegexp(String s) {
        return s.toLowerCase().replaceAll("[aouei]", ""); // Используем regular expressions.
        // В квадратных скобках указаны буквы, котоые мы будет заменять. Второй параметр - это на что мы будем заменять.
    }
}
