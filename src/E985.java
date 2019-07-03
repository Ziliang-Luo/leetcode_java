public class E985 {
    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int length = queries.length;
        int[] a = new int[length];
        for(int i =0; i<length;i++){
            int sum = 0;
            A[queries[i][1]] += queries[i][0];
            for(int j =0; j<A.length;j++){
                if(A[j]%2 == 0){
                    sum += A[j];
                }
            }
            a[i] = sum;
        }
//        for(int i =0; i<a.length;i++){
//            System.out.println(a[i]);
//        }
        return a;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[][] queris =  {{1,0},{-3,1},{-4,0},{2,3}};
        sumEvenAfterQueries(A,queris);
    }
}
