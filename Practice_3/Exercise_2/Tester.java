package Practice_3.Exercise_2;

public class Tester {
    private int size;
    private Circle[] circles;

    public Tester(int size){
        this.size = 0;
        circles = new Circle[size];
    }
    public void addCircle(Circle circle) {
        if (size < circles.length) {
            circles[size++] = circle;
        }
    }
    public void printCircles() {
        for (int i = 0; i < size; i++) {
            System.out.println("circle " + (i+1) + "{ " + circles[i].toString() + "}");
        }
    }
    public void sortCircles() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i; j < size; j++) {
                if (circles[i].getR() > circles[j].getR()) {
                    Circle tmp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = tmp;
                }
            }
        }
    }
}
