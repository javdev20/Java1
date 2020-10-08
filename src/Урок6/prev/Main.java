package prev;

public class Main {
    public static void main(String[] args) {
        Employee empl = new Employee(1, "asd", "asd","mail.com");
        Employee[] employees = {
                new Employee(33, "asd", "asd","mail.com"),
                new Employee(41, "asd", "asd","mail.com"),
                new Employee(51, "asd", "asd","mail.com"),
                new Employee(15, "asd", "asd","mail.com"),
                empl
        };

        Employee[] employees2 = new Employee[5];
        employees2[0] = new Employee(33, "asd", "asd","mail.com");
        employees2[1] = new Employee(33, "asd", "asd","mail.com");
        employees2[2] = new Employee(33, "asd", "asd","mail.com");
        employees2[3] = new Employee(33, "asd", "asd","mail.com");

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i]);
            }
        }
    }
}
