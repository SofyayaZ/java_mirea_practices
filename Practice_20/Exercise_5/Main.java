package Practice_20.Exercise_5;

public class Main {
    public static void main(String[] args) {
        Matrix<Integer> matrix1 = new Matrix<>(2, 2);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(1, 0, 4);
        matrix1.setElement(1, 1, 3);

        Matrix<Integer> matrix2 = new Matrix<>(2, 2);
        matrix2.setElement(0, 0, 7);
        matrix2.setElement(0, 1, 8);
        matrix2.setElement(1, 0, 9);
        matrix2.setElement(1, 1, 10);

        Matrix<Integer> matrixSum = matrix1.add(matrix2);
        System.out.println("Addition:");
        for (int i = 0; i < matrixSum.getRows(); i++) {
            for (int j = 0; j < matrixSum.getColumns(); j++) {
                System.out.print(matrixSum.getElement(i, j) + " ");
            }
            System.out.println();
        }

        Matrix<Integer> matrixProduct = matrix1.multiply(matrix2);
        System.out.println("Multiplication:");
        for (int i = 0; i < matrixProduct.getRows(); i++) {
            for (int j = 0; j < matrixProduct.getColumns(); j++) {
                System.out.print(matrixProduct.getElement(i, j) + " ");
            }
            System.out.println();
        }
    }
}
