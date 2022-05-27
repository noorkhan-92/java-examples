package examples;

public class MatrixElementsSum {

    public MatrixElementsSum() {
        int matrix[][] = {{0, 1, 2}, {2, 1, 0}};
        System.out.println(solution(matrix));
    }

    private int solution(int[][] matrix) {
        int sum = 0;
        for (int c = 0; c < matrix[0].length; c++) {
            for (int r = 0; r < matrix.length; r++) {
                if (matrix[r][c] > 0) {
                    sum = sum + matrix[r][c];
                } else {
                    break;
                }
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        new MatrixElementsSum();
    }

}
