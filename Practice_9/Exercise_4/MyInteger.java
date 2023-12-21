package Practice_9.Exercise_4;

public class MyInteger implements Comparable<MyInteger> {
    private int value;
    public MyInteger(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public int compareTo(MyInteger rhs) {
        if (this.value < rhs.getValue()) {
            return -1;
        }
        else if (this.value > rhs.getValue()) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        MyInteger num1 = new MyInteger(10);
        MyInteger num2 = new MyInteger(5);
        System.out.println("num1.compareTo(num2) = " + num1.compareTo(num2));
        System.out.println("num2.compareTo(num1) = " + num2.compareTo(num1));
        System.out.println("num1.compareTo(num1) = " + num1.compareTo(num1));
    }
}
