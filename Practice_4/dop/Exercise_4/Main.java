package Practice_4.dop.Exercise_4;
public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        matrix1.getArray()[0] = new double[]{1, 2, 3};
        matrix1.getArray()[1] = new double[]{4, 5, 6};

        Matrix matrix2 = new Matrix(2, 3);
        matrix2.getArray()[0] = new double[]{7, 8, 9};
        matrix2.getArray()[1] = new double[]{10, 11, 12};

        matrix1.add(matrix2);
        matrix1.print();
        // Вывод:
        // 8.0 10.0 12.0
        // 14.0 16.0 18.0

        matrix1.multiply(2);
        matrix1.print();
        // Вывод:
        // 16.0 20.0 24.0
        // 28.0 32.0 36.0

        Matrix matrix3 = new Matrix(3, 2);
        matrix3.getArray()[0] = new double[]{1, 2};
        matrix3.getArray()[1] = new double[]{3, 4};
        matrix3.getArray()[2] = new double[]{5, 6};

        matrix1.multiply(matrix3);
        matrix1.print();
        // Вывод:
        // 108.0 136.0
        // 244.0 308.0
    }
}
