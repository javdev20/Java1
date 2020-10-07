/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Урок6.HW.classes;

/**
 *
 * @author User
 */
public class Dog extends Animal{

    public Dog(int runLimit, int swimLimit, double jumpLimit) {
        super(runLimit, swimLimit, jumpLimit);
    }

    public boolean run(int run) {
            return runLimit == run;    
    } 
    
    public boolean swim(int swim){
            return swimLimit == swim; 
    }
   
    public boolean jumpBarrier(double jump){
            return jumpLimit == jump;
    }
}

   
