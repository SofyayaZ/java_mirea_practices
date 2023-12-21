package Practice_9.Exercise_3;

import java.util.ArrayList;
import java.util.List;

public class MergedSort {
    public static void main(String[] args) {
        List <Student> list1 = new ArrayList<>();
        list1.add(new Student("John", 20));
        list1.add(new Student("Emma", 22));
        list1.add(new Student("Alex", 28));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Sarah", 19));
        list2.add(new Student("Mike", 21));
        list2.add(new Student("Sophia", 23));

        List<Student> mergedList = mergeLists(list1, list2);

        for (Student student : mergedList) {
            System.out.println(student.getName() + " is " + student.getAge() + " years old");
        }
    }
    private static List<Student> mergeLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()) {
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.getAge() < student2.getAge()) {
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
}
