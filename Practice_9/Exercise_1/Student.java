package Practice_9.Exercise_1;

public class Student {
    private  String name;
    private int iDNumber;
    public Student (String name, int iDNumber) {
        this.iDNumber = iDNumber;
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }
    public String toString() {
        return "Student {name = " + name + "; iDNumber = " + iDNumber + "}";
    }
}
