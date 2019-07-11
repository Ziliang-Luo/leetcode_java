public class E1009 {
    public static int bitwiseComplement(int N) {
        int X = 1;
        while (N > X) X = X * 2 + 1;
        return N ^ X;
    }

    public static void main(String[] args) {
        int N = 5;
        bitwiseComplement(N);
    }
}
