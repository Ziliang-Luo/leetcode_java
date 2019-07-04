public class E1103 {
    public static int[] distributeCandies(int candies, int num_people) {
        int[] a  = new int[num_people];
        int start = 1;
        for(int i = 0 ; i<num_people;i++) {
            if (candies > start) {
                candies = candies - start;
                a[i] = a[i] + start;
                start++;
                if (i == num_people - 1) {
                    i = -1;
                    System.out.println("reach");
                }
            }
            else{
                a[i] = a[i] + candies;
                break;
            }
        }
//        for(int i = 0; i< a.length; i++){
//            System.out.println(a[i]);
//        }
        return a;
    }

    public static void main(String[] args) {
        int candies = 10;
        int num_people = 3;
        distributeCandies(candies, num_people);
    }
}
