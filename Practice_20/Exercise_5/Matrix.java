package Practice_20.Exercise_5;

public class Matrix<T extends Number> {
    private T[][] matrix;
    private int rows;
    private int columns;

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = (T[][]) new Number[rows][columns];
    }

    public void setElement(int row, int column, T element) {
        matrix[row][column] = element;
    }

    public T getElement(int row, int column) {
        return matrix[row][column];
    }

    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException("Matrices have different sizes");
        }

        Matrix<T> result = new Matrix<>(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                double sum = matrix[i][j].doubleValue() + other.matrix[i][j].doubleValue();
                T value = (T) getNumberInstance(sum);
                result.setElement(i, j, value);
            }
        }
        return result;
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (columns != other.rows) {
            throw new IllegalArgumentException("Incompatible matrix sizes");
        }

        Matrix<T> result = new Matrix<>(rows, other.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                T[] currentRow = matrix[i];
                T[] currentColumn = getColumn(other.matrix, j);
                T value = multiplyElements(currentRow, currentColumn);
                result.setElement(i, j, value);
            }
        }
        return result;
    }

    private T multiplyElements(T[] row, T[] column) {
        double result = 0.0;
        for (int i = 0; i < row.length; i++) {
            result += row[i].doubleValue() * column[i].doubleValue();
        }
        return (T) getNumberInstance(result);
    }

    private T[] getColumn(T[][] matrix, int column) {
        T[] result = (T[]) new Number[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][column];
        }
        return result;
    }

    private Number getNumberInstance(double value) {
        if (matrix[0][0] instanceof Integer) {
            return (int) value;
        } else if (matrix[0][0] instanceof Double) {
            return value;
        }
        throw new IllegalArgumentException("Unsupported data type");
    }
}
