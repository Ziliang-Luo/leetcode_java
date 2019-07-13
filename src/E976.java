import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E976 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for(int i =A.length-3; i>=0;i--){
            if(A[i] +A[i+1] >A[i+2]){
                return A[i] + A[i+1] +A[i+2];
            }
        }
        return 0;
    }
}
