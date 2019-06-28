public class E509 {
    public static int fib(int N) {
        int sum = 0;
        if(N == 0){
            sum = 0;
        }
        else if(N ==1){
            sum = 1;
        }
        else{
            sum = fib(N-1) +fib(N-2);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
