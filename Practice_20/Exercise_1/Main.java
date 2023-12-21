package Practice_20.Exercise_1;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        MyGenericClass<String, Animal, Double> object = new MyGenericClass<>("Hello", dog, 1.4);
        object.printParameters();
    }
}
