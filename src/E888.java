import java.util.Arrays;

public class E888 {
    public static int[] fairCandySwap(int[] A, int[] B) {
        int sumA =sum(A);
        int sumB =sum(B);
        return check(A,B,sumB-sumA);
    }

    public static int sum(int[] A){
        int sum = 0;
        for(int i = 0; i<A.length;i++){
            sum +=A[i];
        }
        return sum;
    }

    public static int[] check(int[] A, int[] B, int diff){
        //A small
        //B large
        int[] ans = new int[2];
        diff = diff/2;
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j<B.length; j++) {
                    if (B[j] - A[i] == diff) {
                        ans[0] = A[i];
                        ans[1] = B[j];
                    }
                }
            }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1,2,5};
        int[] B = {2,4};
        fairCandySwap(A,B);
    }
}
