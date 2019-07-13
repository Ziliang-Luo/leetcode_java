import java.util.Stack;

public class E917 {
    public static String reverseOnlyLetters(String S) {
        char[] c = S.toCharArray();
        String ans = "";
        Stack<Character> s = new Stack<>();
        for(int i = 0; i< c.length;i++){
            if(Character.isLetter(c[i])){
                s.add(c[i]);
            }
        }
        for(int i = 0; i< c.length;i++){
            if(Character.isLetter(c[i])){
                Character temp = s.pop();
                c[i] = temp;
                ans += temp;
            }
            else{
                ans +=c[i];
            }
        }

        //System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        String S ="a-bC-dEf-ghIj";
        reverseOnlyLetters(S);
    }
}
