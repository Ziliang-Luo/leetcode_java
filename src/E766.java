public class E766 {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for(int i = 0;i<matrix.length;++i){
            for(int j=0;j<matrix[0].length;++j){
            if(i>0 && j>0 && matrix[i-1][j-1] != matrix[i][j]) {
                //System.out.println(matrix[i - 1][j - 1]);
                return false;
            }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        isToeplitzMatrix(matrix);
    }
}