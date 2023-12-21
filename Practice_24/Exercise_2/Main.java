package Practice_24.Exercise_2;

public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory concreteFactory = new ConcreteFactory();
        concreteFactory.createComplex();
        concreteFactory.createComplex(2,5);
    }
}
