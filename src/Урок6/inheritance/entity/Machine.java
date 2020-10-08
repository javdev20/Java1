package Урок6.inheritance.entity;

public abstract class Machine {
    protected String name;

    public Machine(String name) {
        this.name = name;
    }

    public abstract void go();
    public abstract void stop();
}
