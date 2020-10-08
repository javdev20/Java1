package prev;

public class Employee {
    private int age;
    private String name;
    private String surname;
    private String email;

    public Employee(int age, String name, String surname, String email) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void printInfo() {
        System.out.println(
                String.format("Employee[id: %s, name: %s, surname: %s, email: %s]", age, name, surname, email)
        );
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
