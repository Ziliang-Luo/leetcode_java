public class E922 {
    public static int[] sortArrayByParityII(int[] A) {
        int length = A.length;
        int[] odd = new int[length/2];
        int[] even = new int[length/2];
        int x = 0;
        int y=0;
        for(int i=0; i < A.length; i++){
            if (A[i] %2 ==0) {
                even[x++] = A[i];
            }
            else{
                odd[y++] = A[i];
            }
        }
        x=0;
        y=0;
        for(int j=0; j < A.length; j++){
            if(j%2 ==0){
                A[j] = even[x++];
            }
            else{
                A[j] = odd[y++];
            }
        }
//        for(int a: A){
//            System.out.println(a);
//        }
        return A;
    }

    public static void main(String[] args) {
        int[] a = {4,2,5,7};
        sortArrayByParityII(a);
    }
}
