package Урок6.inheritance.entity;

public class Water extends Machine {
    public Water(String name) {
        super(name);
    }

    @Override
    public void go() {
        System.out.println("Water Machine is going on...");
    }

    @Override
    public void stop() {
        System.out.println("Water Air Machine...");
    }

    @Override
    public String toString() {
        return "Water{" +
                "name='" + name + '\'' +
                '}';
    }
}
