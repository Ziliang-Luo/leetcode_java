public class E461 {
    public int hammingDistance(int x, int y) {
        String BinaryX=Integer.toBinaryString(x);
        String BinaryY=Integer.toBinaryString(y);
        String X=new StringBuffer(BinaryX).reverse().toString();
        String Y=new StringBuffer(BinaryY).reverse().toString();

        int res=0;
        int startX=0;
        int startY=0;

        while(startX<X.length() && startY<Y.length()){
            if(X.charAt(startX)!=Y.charAt(startY)){
                res++;
            }
            startX++;
            startY++;
        }
        if(X.length()>=Y.length()){
            for(int i=startX;i<X.length();i++){
                if(X.charAt(i)=='1'){
                    res+=1;
                }
            }
        }else{
            for(int i=startY;i<Y.length();i++){
                if(Y.charAt(i)=='1'){
                    res+=1;

                }
            }
        }

        return res;

    }

}
