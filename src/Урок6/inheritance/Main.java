package Урок6.inheritance;

import Урок6.inheritance.entity.Air;
import Урок6.inheritance.entity.Ground;
import Урок6.inheritance.entity.Machine;
import Урок6.inheritance.entity.Water;

public class Main {
    public static void main(String[] args) {
        Air air = new Air("IL-2");

        Machine[] machines = {
                new Ground("BMW M2"),
                new Water("USS Yorktown"),
                new Air("TU-122")
        };

        for (int i = 0; i < machines.length; i++) {
            System.out.println(machines[i]);
            machines[i].go();
            machines[i].stop();
        }
    }
}
