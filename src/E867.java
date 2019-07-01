public class E867 {
    public static int[][] transpose(int[][] A) {
        int lengthX = A[0].length;
        int lengthY = A.length;
        int[][] B = new int[lengthX][lengthY];
        for(int i = 0; i< lengthX;i++){
            for(int j = 0; j<lengthY;j++){
                B[i][j] = A[j][i];
            }
        }
        for(int i = 0; i< lengthX;i++){
            for(int j = 0; j<lengthY;j++) {
                System.out.println(B[i][j]);
            }
            }
        return B;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6}};
        transpose(A);
    }
}
