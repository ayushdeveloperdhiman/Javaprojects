import java.util.Arrays;

public class Anagram {
    static boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll(" ", "");
        String s2 = str2.replaceAll(" ", "");

        if (s1.length() != s2.length()) {
           return false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            return Arrays.equals(ArrayS1, ArrayS2);
        }
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silence"));
        System.out.println(isAnagram("abcd","cdba"));
        System.out.println(isAnagram("Army","Mary"));
    }
}
