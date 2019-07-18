public class E258 {
    public int addDigits(int num){
        if (num == 0){
            return 0;
        }
        if (num % 9 == 0){
            return 9;
        }
        else {
            return num % 9;
        }
    }
//    public static int addDigits(int num) {
//        //int n =0;
//        if(num <10){
//            System.out.println(num);
//            return num;
//        }
//        while(num >10){
//            num = reduce(num);
//        }
//        System.out.println(num);
//        return num;
//    }
//
//
//    public static int reduce(int num){
//        int n =0;
//        String s = Integer.toString(num);
//        for(int i = 0; i<s.length();i++){
//            if(s.length()>1){
//                n += s.charAt(i);
//            }
//        }
//        return n;
//    }

    public static void main(String[] args) {
        int num = 12;
        //addDigits(num);
    }
}
