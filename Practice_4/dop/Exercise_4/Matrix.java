package Practice_4.dop.Exercise_4;

public class Matrix {
    private double[][] array;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        array = new double[rows][columns];
    }

    public void add(Matrix other) {
        if (rows != other.getRows() || columns != other.getColumns()) {
            System.out.println("Матрицы должны быть одинакового размера!");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] += other.getArray()[i][j];
            }
        }
    }

    public void multiply(double number) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] *= number;
            }
        }
    }

    public void multiply(Matrix other) {
        if (columns != other.getRows()) {
            System.out.println("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы!");
            return;
        }

        double[][] result = new double[rows][other.getColumns()];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.getColumns(); j++) {
                for (int k = 0; k < columns; k++) {
                    result[i][j] += array[i][k] * other.getArray()[k][j];
                }
            }
        }

        array = result;
        columns = other.getColumns();
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public double[][] getArray() {
        return array;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}