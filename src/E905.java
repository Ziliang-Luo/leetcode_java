import java.util.ArrayList;
import java.util.List;



//convert List<Interger> to int array
public class E905 {
    public int[] sortArrayByParity(int[] A) {
        List<Integer> B = new ArrayList() ;
        List<Integer> C = new ArrayList() ;
        for(int i =0; i < A.length;i++){
            if (A[i]%2 ==0){
                B.add(A[i]);
            }
            else{
                C.add(A[i]);
            }
        }
        B.addAll(C);
        int[] array =B.stream().mapToInt(i->i).toArray();
        return array;
    }
}


//答案
//class Solution {
//    public int[] sortArrayByParity(int[] A) {
//        int[] ans = new int[A.length];
//        int t = 0;
//
//        for (int i = 0; i < A.length; ++i)
//            if (A[i] % 2 == 0)
//                ans[t++] = A[i];
//
//        for (int i = 0; i < A.length; ++i)
//            if (A[i] % 2 == 1)
//                ans[t++] = A[i];
//
//        return ans;
//    }
//}