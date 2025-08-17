import java.util.Random;

public class MatrixReview {

    int n;
    int[][] MatrixA, MatrixB;

    //Tạo hai ma trận
    public MatrixReview(int n) {
        this.n = n;
        MatrixA = new int[n][n];
        MatrixB = new int[n][n];
        innitvalua();
    }

    //Truyền dữ liệu vào
    public void innitvalua() {
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                MatrixA[i][j] = r.nextInt(10);
                MatrixB[i][j] = r.nextInt(10);
            }
        }
    }

    //In Matrix
    public void PrintMatrix(int[][] matrix) {
        System.out.println("Matrix:-----");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void printMaTrixA() {
        PrintMatrix(MatrixA);
    }

    public void printMatrixB() {
        PrintMatrix(MatrixB);
    }

    // Sum two matrixs
    public int[][] SumMatrix() {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = MatrixA[i][j] + MatrixB[i][j];

            }
        }
        return result;
    }
    //multip two matrix
    public int[][] Multip() {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += MatrixA[i][k] * MatrixB[k][j];

                }
            }
        }
        return result;
    }
}


