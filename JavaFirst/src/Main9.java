public class Main9 {
    public static String remove(String arg, String str) {
        String r="",temp=str;
        for (int i = 0; i < arg.length(); i++) {
            r="";
            char ch_arg=arg.charAt(i);
            if(Character.isAlphabetic(ch_arg)) {
                for (int j = 0; j < temp.length(); j++) {
                    char ch_str = temp.charAt(j);
                    if (ch_str == ch_arg) {
                        continue;
                    }
                    r += ch_str;
                }
                temp = r;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        System.out.println(remove("ah123","My name is ayush 32,4548"));
    }

}
