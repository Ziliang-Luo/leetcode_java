import com.sun.deploy.util.StringUtils;

public class E762 {
    public static int countPrimeSetBits(int L, int R) {
        String someString;
        int ans =0;
        for(int i =L; i<= R; i++) {
            int count = 0;
            someString = Integer.toBinaryString(i);
            for (int j = 0; j < someString.length(); j++) {
                if (someString.charAt(j) == '1') {
                    count++;
                }
            }
            //System.out.println(count);
            if(isPrime(count)){
                ans++;
            }
        }
        //System.out.println(ans);
        return ans;
    }

    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                //System.out.println("false");
                return false;
            }
        }
        //System.out.println("true");
        return true;
    }


    public static void main(String[] args) {
        isPrime(4);
        countPrimeSetBits(10,15);
    }
}
