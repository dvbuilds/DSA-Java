public class rotateMatrix {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        //Transpose the matrix
        for(int i = 0; i < m; i++) {
            for(int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Reverse the transpose
        for(int i = 0; i < m; i++) {
            int left = 0;
            int right = n-1;
            while(left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        rotateMatrix obj = new rotateMatrix();

        obj.rotate(matrix);

        for(int[] row : matrix) {
            for(int val: row) {
                System.out.print(val+ "  ");
            }
            System.out.println();
        }
    }
}
