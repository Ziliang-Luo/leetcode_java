public class E1047 {
    public static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder(S);
        while (!check(sb)) {
            for (int i = 0; i < sb.length()-1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.deleteCharAt(i+1);
                    sb.deleteCharAt(i);
                    //break;
                }
            }
            //System.out.println(sb);
        }
        return sb.toString();
    }

    public static Boolean check (StringBuilder S){
        //StringBuilder sb = new StringBuilder(S);
        for (int i = 0; i < S.length()-1; i++) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
         String s = "abbaca";
         removeDuplicates(s);
    }
}
