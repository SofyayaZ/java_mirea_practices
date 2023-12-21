package Practice_7.Exercise_4;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double x, double y) {
        return Math.pow(x, y);
    }
    @Override
    public double absComplex(double realPart, double imaginaryPart) {
        return Math.sqrt(Math.pow(realPart, 2) + Math.pow(imaginaryPart, 2));
    }
}
