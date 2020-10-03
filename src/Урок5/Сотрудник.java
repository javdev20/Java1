package Урок5;

/** ДЗ 5-го урока
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
консоль.
4. Создать массив из 5 сотрудников.
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

public class Сотрудник {
    String fullName;
    String position;
    String email;
    int phone;
    int salary;
    int age;
    
     public Сотрудник (String fullName, String position, String email, int phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    
    public void formInfo() {
            System.out.println("Ф.И.О: " + fullName + System.lineSeparator() + "Должность: " + position
            + System.lineSeparator() + "email: " + email + System.lineSeparator() + "Телефон: " + phone 
            + System.lineSeparator() + "Зарплата: " + salary + System.lineSeparator() + "Возраст: " + age);
     }
}    

class MainClass {
        public static void main(String[] args) {
        Сотрудник[] persArray = new Сотрудник[5];
        persArray[0] = new Сотрудник("Карпюк Марк", "Java-разработчик", "wmiller@stamm.com", 851805464, 100000, 28);
        persArray[1] = new Сотрудник("Трутнева Татьяна", "Бухгалтер", "yeltsova06@mail.ru", 414949254, 70000, 39);
        persArray[2] = new Сотрудник("Пыжалова Евдокия", "Product-менеджер", "fhane@russel.com", 798115984, 85000, 43);
        persArray[3] = new Сотрудник("Краевич Ростислав", "Java-разработчик", "khickle@robel.biz", 712045605,80000, 35);
        persArray[4] = new Сотрудник("Веденеев Соломон", "Android-разработчик", "kiara86@gmail.com", 854236998, 96000, 47);   
        
        for (Сотрудник arr : persArray) {
            if (arr.age > 40) {
                arr.formInfo();
                System.out.println();
            }
        }
    }
    }

    
     
