public class ReverseString {
    public static void main(String[] args) {
        String s = "sd&hg#j";
        String s2 = "";
        char ch[] = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) >= 33 && s.charAt(i) <= 47) {
                for (int j = 0; j < s.length(); j++) {
                    ch[j] = s.charAt(i);
                }
            } else {
                char c = s.charAt(i);
                s2 = s2 + c;
            }
        }
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) >= 33 && s.charAt(i) <= 47) {
               s2=addCharToStringUsingSubString(s2,s.charAt(i), i);
            }
        }
        System.out.println(s2);
    }
    public static String addCharToStringUsingSubString(String str, char c, int pos) {
        return str.substring(0, pos)+ c +str.substring(pos);
    }
}

