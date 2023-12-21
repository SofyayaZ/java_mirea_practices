package Practice_20.Exercise_4;

import Practice_16.Exercise_2.InteractiveMap;

public class Calculator {

    public static <T extends Number> T sum(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        }
        else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        }
        throw new IllegalArgumentException("Incorrect input data");
    }

    public static <T extends Number> T sub(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        }
        else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        }
        throw new IllegalArgumentException("Incorrect input data");
    }

    public static <T extends Number> T mul(T a, T b) {
        if (b.intValue()==0) {
            throw new ArithmeticException("Divide by zero");
        }
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        }
        else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        }
        throw new IllegalArgumentException("Incorrect input data");
    }

    public static <T extends Number> T div(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        }
        else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        }
        throw new IllegalArgumentException("Incorrect input data");
    }
}

