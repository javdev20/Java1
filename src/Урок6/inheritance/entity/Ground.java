package Урок6.inheritance.entity;

public class Ground extends Machine {
    public Ground(String name) {
        super(name);
    }

    @Override
    public void go() {
        System.out.println("Ground Machine is going on...");
    }

    @Override
    public void stop() {
        System.out.println("Ground Air Machine...");
    }

    @Override
    public String toString() {
        return "Ground{" +
                "name='" + name + '\'' +
                '}';
    }
}
