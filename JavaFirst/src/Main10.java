public class Main10 {
    public static String filterLetters(String str,char ch,boolean more){
        String ans="",temp=str;
        for(int i=0;i<str.length();i++) {
            char str_ch = str.charAt(i);
            if (Character.isAlphabetic(str_ch)) {
                if (more) {
                    if (str_ch >= ch) {
                        continue;
                    }
                } else {
                    if (str_ch <= ch) {
                        continue;
                    }
                }

            }
            ans += str_ch;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(filterLetters("abcdefg1230",'d',true));
    }
}
