public class E1021 {
    public static String removeOuterParentheses(String S) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : S.toCharArray()) {

            if (c == '(' && count++ > 0) { sb.append(c); }
            if (c == ')' && --count > 0) { sb.append(c); }

        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String S = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(S));
    }
}
