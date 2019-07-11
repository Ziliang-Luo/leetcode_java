import java.util.LinkedList;
import java.util.Queue;

public class E1089 {
    public static void duplicateZeros(int[] arr) {
        Queue q = new LinkedList();
        for(int i = 0; i< arr.length;i++){
            if(arr[i] != 0){
                q.add(arr[i]);
            }
            else{
                q.add(0);
                q.add(0);
            }
        }
        for(int i =0; i<arr.length;i++){
            arr[i] = (Integer)q.poll();
            //System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,0,2,3,0,4,5,0};
        duplicateZeros(a);
    }
}
