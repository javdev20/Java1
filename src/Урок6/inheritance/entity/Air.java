package Урок6.inheritance.entity;

public class Air extends Machine {
    public Air(String name) {
        super(name);
    }

    @Override
    public void go() {
        System.out.println("Air Machine is going on...");
    }

    @Override
    public void stop() {
        System.out.println("Stop Air Machine...");
    }

    @Override
    public String toString() {
        return "Air{" +
                "name='" + super.name + '\'' +
                '}';
    }
}
