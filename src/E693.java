public class E693 {
    public static boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        for(int i=0; i< s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }

    public static void main(String[] args) {
        int n = 11;
        hasAlternatingBits(n);
    }
}
