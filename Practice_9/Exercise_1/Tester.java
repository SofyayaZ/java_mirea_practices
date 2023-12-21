package Practice_9.Exercise_1;

public class Tester {
    public static void main(String[] args) {
        Student[] students = {
            new Student ("John", 5),
            new Student ("Anna", 1),
            new Student ("Sarah", 4),
            new Student ("Bob", 3),
            new Student ("Henry", 2)
        };
        for (int i = 0; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getiDNumber() > current.getiDNumber()) {
                students[j+1] = students[j];
                j--;
            }
            students[j+1] = current;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
