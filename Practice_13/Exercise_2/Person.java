package Practice_13.Exercise_2;

import java.lang.StringBuilder;
public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
    public String getFullName() {
        StringBuilder fullName = new StringBuilder();
        if (surname!=null) {
            fullName.append(surname).append(" ");
        }
        if (name!=null) {
            fullName.append(name.charAt(0)).append(".");
        }
        if (patronymic!=null) {
            fullName.append(patronymic.charAt(0)).append(".");
        }
        return fullName.toString();
    }
}
