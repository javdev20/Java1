/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Урок6.HW.main;

import Урок6.HW.Animal;
import Урок6.HW.Cat;
import Урок6.HW.Dog;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        
        Dog dog1 = new Dog(500, 10, 0.5);
        Dog dog2 = new Dog(400, 8, 0.8);
        Dog dog3 = new Dog(600, 12, 0.6);
        System.out.println(dog1.swim(10));
        
        Cat cat1 = new Cat(200, 2);
        Cat cat2 = new Cat(205, 1);
        Cat cat3 = new Cat(250, 3);
        System.out.println(cat1.run(500));
        System.out.println(cat1.jumpBarrier(2));
    }
}
