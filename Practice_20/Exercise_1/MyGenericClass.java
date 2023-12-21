package Practice_20.Exercise_1;

import java.io.Serializable;
import java.util.Comparator;


public class MyGenericClass<T extends Comparable<T>,V extends Animal & Serializable,K> {
    private T parameter1;
    private V parameter2;
    private K parameter3;
    public MyGenericClass(T parameter1, V parameter2, K parameter3){
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.parameter3 = parameter3;
    }
    public T getParameter1() {
        return parameter1;
    }
    public V getParameter2() {
        return parameter2;
    }
    public K getParameter3() {
        return parameter3;
    }

    public void setParameter1(T parameter1) {
        this.parameter1 = parameter1;
    }

    public void setParameter2(V parameter2) {
        this.parameter2 = parameter2;
    }

    public void setParameter3(K parameter3) {
        this.parameter3 = parameter3;
    }
    public void printParameters() {
        System.out.println("Parameter1 = " + parameter1);
        System.out.println("Parameter2 = " + parameter2);
        System.out.println("Parameter3 = " + parameter3);
    }
}
