/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Урок6.HW;

/**
 *
 * @author User
 */
public class Cat extends Animal{

    public Cat(int runLimit, double jumpLimit) {
        super(runLimit, jumpLimit);
    }
    
    public boolean run(int run) {
            return runLimit == run;    
    } 
    
    public boolean jumpBarrier(double jump){
            return jumpLimit == jump;
    }
    
}
