import java.util.Arrays;

public class E942 {
    public static int[] diStringMatch(String S) {
        int length = S.length()+1;
        int a[] = new int[length];
        int start = -1;
        int end = length;
        for(int i =0; i< a.length-1; i++){
            if(S.charAt(i) =='I'){
                start =  start+ 1;
                a[i] = start;
            }
            if(S.charAt(i) =='D'){
                end = end - 1;
                a[i] = end;
            }
        }
        if(S.charAt(length-2) =='I'){
            a[a.length-1] = a[a.length-2] +1;
        }
        if(S.charAt(length-2) =='D'){
            a[a.length-1] = a[a.length-2] -1;
        }
        return a;
    }

    public static void main(String[] args) {
        String s = "DDI";
        diStringMatch(s);
    }

}
