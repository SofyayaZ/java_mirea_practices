package Practice_9.Exercise_2;

class Student {
    private String name;
    private double GPA;
    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
