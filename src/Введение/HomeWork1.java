/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Введение;

/**
 *
 * @author User
 */
public class HomeWork1 {

    /**
     * @param args the command line arguments
     */
    //ДЗ №1
    public static void main(String[] args) {
        // TODO code application logic here
        //ДЗ №2
       /** int a = 10;
        double d = 12;
        float fl = 4F;
        char ch = 'c';
        String hello = "Привет";
        boolean = true;
        */
        //ДЗ №3
        double result = Calculation(24, 34, 12, 50);
        System.out.println(result);
        
        //ДЗ №4
        System.out.println(isTrue(6, 4));
        
        //ДЗ №5
        String number = checkingNumber(0);
        System.out.println(number);
        
        //ДЗ №6
        System.out.println(negative(-8));
        
        //Дз №7
        hello();
        
        //ДЗ №8
        System.out.println(bissextile(16));
    }
    
    static double Calculation(int a, int b, int c, int d) {
       
        return  a * (b + (c / d));
       
    }
    
       
    
    static boolean isTrue(int a, int b) {
    int i = 10;
    while (i <= 20) {
            if (a + b == i) {
            return true;
            }
            i++;
        }
    return false;
    }
    
    static String checkingNumber(int x) {
        if (x >= 0) {
            return "The number is positive";
        }
        return "The number is negative";
    }
    
    static boolean negative(int x) {
        if(x<0) {
            return true;
        } else {
            return false;
        }
    }
    
    static void hello() {
        String name = "Максим";
        System.out.println("Привет, " + name + "!");
    }
    
    static String bissextile(int year) {
        
            if((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)){
                return "Год високосный!";
            }  
            return "Год не високосный!";
    }
}