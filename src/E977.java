import java.util.Arrays;

public class E977 {
    public static int[] sortedSquares(int[] A) {
        for(int i =0; i<A.length;i++){
            A[i] *= A[i];
        }
        Arrays.sort(A);
//        for(Integer y : A){
//            System.out.println(y);
//        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {-4,-1,0,3,10};
        sortedSquares(A);
    }

}
