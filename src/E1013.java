public class E1013 {
    public static boolean canThreePartsEqualSum(int[] A) {
//        int sum1 =0;
//        for(int i =0; i<A.length-2;i++){
//            int sum2 =0;
//            sum1 += A[i];
//            for(int j =i+1;j<A.length-1;j++){
//                int sum3 =0;
//                sum2 += A[j];
//                //System.out.println(sum2);
//                for(int k =j+1; k<A.length;k++){
//                    sum3 += A[k];
//                    if(sum1 == sum2 && sum2==sum3){
//                        System.out.println("true");
//                        System.out.println(sum1);
//                        return true;
//                    }
//                }
//            }
//        }
//        System.out.println("false");
//        return false;
        int sum = 0;
        //calculate overall sum
        for (int n : A)
            sum += n;
        //check if it's divisible by 3
        if (sum % 3 != 0)
            return false;
        //exact sum of each segment
        sum /= 3;

        int curSum = 0;
        int numOfSegments = 0;
        for (int i = 0; i < A.length; i++) {
            curSum += A[i];
            //check if we can form a segment
            if (curSum == sum && numOfSegments <= 1) {
                numOfSegments++;
                curSum = 0;
            }
        }
        //if we have 2 segments formed greedily and sum of leftover is also 1/3 of overall sum
        return (numOfSegments == 2 && curSum == sum);
    }

    public static void main(String[] args) {
        int[] A = {3,3,6,5,-2,2,5,1,-9,4};
        canThreePartsEqualSum(A);
    }
}
