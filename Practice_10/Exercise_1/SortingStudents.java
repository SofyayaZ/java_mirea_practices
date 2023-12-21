package Practice_10.Exercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Comparator;
public class SortingStudents implements Comparator<Student> {
    public void sortStudentsByCourse(List<Student> students) {
        if (!students.isEmpty()) {
            mergeSort(students, 0, students.size() - 1);
        }
    }
    public void mergeSort(List<Student> students, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(students, left, middle);
            mergeSort(students, middle + 1, right);

            merge(students, left, middle, right);
        }
    }
    public void merge(List<Student> students, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        List<Student> leftList = new ArrayList<>();
        List<Student> rightList = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            leftList.add(students.get(left + i));
        }
        for (int j = 0; j < n2; j++) {
            rightList.add(students.get(middle + 1 + j));
        }
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftList.get(i).getCourse() <= rightList.get(j).getCourse()) {
                students.set(k, leftList.get(i));
                i++;
            } else {
                students.set(k, rightList.get(j));
                j++;
            }
            k++;
        }
        while (i < n1) {
            students.set(k, leftList.get(i));
            i++;
            k++;
        }
        while (j < n2) {
            students.set(k, rightList.get(j));
            j++;
            k++;
        }
    }
    public void sortStudentsByGPA(List<Student> iDNumber) {
        quickSort(iDNumber, 0, iDNumber.size() - 1);
    }
    private void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }
    private int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students.get(j), pivot) > 0) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, high);
        return i + 1;
    }
    private static void swap(List<Student> students, int i, int j) {
        Student temp = students.get(i);
        students.set(i, students.get(j));
        students.set(j, temp);
    }
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGPA(), s1.getGPA());
    }
    private static List<Student> mergeLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()) {
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.getCourse() <= student2.getCourse()) {
                mergedList.add(student1);
                i++;
            }
            else {
                mergedList.add(student2);
                j++;
            }
        }
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }
        return mergedList;
    }
    public void setArray(List<Student> iDNumber, int size) {
        Random random = new Random();
        String [] names = {"Sarah","John","Mel"};
        String [] surnames = {"Black","Green","White"};
        String [] faculties = {"Software Engineering", "Information Security", "Applied Informatics"};
        for (int i = 0; i < size; i++) {
            String name = names[random.nextInt(names.length)];
            String surname = surnames[random.nextInt(surnames.length)];
            String faculty = faculties[random.nextInt(faculties.length)];
            double GPA = random.nextDouble() * 5;
            int course = random.nextInt(1,4);
            int group = random.nextInt(1,10);
            iDNumber.add(new Student(name, surname, faculty, course, group, GPA));
        }
    }
    public void outArray(List<Student> iDNumber) {
        for (Student student:iDNumber) {
            System.out.println(student.toString());
        }
    }
    public static void main(String[]args) {
        SortingStudents tester = new SortingStudents();
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        
        tester.setArray(list1, 5);
        tester.setArray(list2, 6);
        System.out.println("The 1st list of students: ");
        tester.outArray(list1);
        System.out.println("The 2nd list of students: ");
        tester.outArray(list2);

        tester.sortStudentsByGPA(list1);
        System.out.println("\nList1 of students sorted by GPA: ");
        tester.outArray(list1);

        tester.sortStudentsByCourse(list2);
        System.out.println("\nList2 of students sorted by course: ");
        tester.outArray(list2);

        System.out.println("\nMerged lists of students sorted by course: ");
        tester.sortStudentsByCourse(list1);
        tester.outArray(mergeLists(list1, list2));
    }
}
