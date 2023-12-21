package Practice_13.Exercise_2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Zaitceva","Darya", "Denisovna");
        Person person2 = new Person("Zaitcev", "Den", null);
        Person person3 = new Person("Chernova", null,"Aleksandrovna");
        Person person4 = new Person(null, "Sally", null);
        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
        System.out.println(person4.getFullName());
    }
}
