import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//     Matrix m = new Matrix(3);
//     m.printMatrixA();
//     m.printMatrixB();
//     System.out.println("A + B");
//     m.printMatrix(m.sumMatrix());
//     System.out.println("A * B");
//     m.printMatrix(m.multipMatrix());
//    }
    MatrixReview m = new MatrixReview(3);
        m.printMaTrixA();
        m.printMatrixB();
        System.out.println("-------Sum two matrix------");
        m.PrintMatrix(m.SumMatrix());
        System.out.println("------Multip two matrix------");
        m.PrintMatrix(m.Multip());
}

}