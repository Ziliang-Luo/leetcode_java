import java.util.ArrayList;
import java.util.List;

public class E1002No {
    public List<String> commonChars(String[] A) {
        List<String> str = new ArrayList();
        char[] array = A[0].toCharArray();

        for(int i=0;i<array.length ; i++){
            for(int j =1; j<A.length; j++){
                int index = A[j].indexOf(array[i]);
                if(index <= -1){
                    break;
                }else{
                    A[j] = A[j].substring(0, index)+A[j].substring(index+1);
                }

                if(j == A.length-1 ){
                    str.add(String.valueOf(array[i]));
                }
            }

        }

        return str;
    }
}
