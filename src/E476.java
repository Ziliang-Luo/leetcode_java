public class E476 {
    public static int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        String result = "";
        for(int i= 0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                result +="0";
            }
            else{
                result +="1";
            }
            //System.out.println(result);
        }
        num = Integer.parseInt(result,2);
        //System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        findComplement(1);
    }
}
