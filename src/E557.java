public class E557 {
    public static String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word: words){
            res.append(new StringBuffer(word).reverse().toString()+ " ");
        }
        System.out.println(res.toString().trim());
        return res.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        reverseWords(s);
    }

}
