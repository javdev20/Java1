package Урок2;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class HomeWork2 {
    public static void main(String[] args) {

        //ДЗ 2.1
        int[] arr = { 1, 0, 1, 1, 0, 1, 0, 0, 1 };
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
            }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        
        //ДЗ 2.2
        int[] ar = new int[8];
        int e = 0;
        for (int i = 0; i < 8; i++) {
            ar[i] = e;
            e += 3; // 0+3+3+3+3+3+3+3
        }
        for (int i = 0; i < 8; i++)
            System.out.println("ar[" + i + "] = " + ar[i]);
        System.out.println();
        
        //ДЗ 2.3
        int[] arr_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        
        for (int i = 0; i < arr_3.length; i++) {
            int result;
            if (arr_3[i] < 6) {
                result = arr_3[i] * 2;
                System.out.print(result + " ");
            }
         }
        System.out.println();
        System.out.println();
        

        //ДЗ 2.4
        int counter = 1;
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            table[i][j] = counter;
            if (i == j) table[i][j] = 1;
            if (table[i][j] < 10) System.out.print(" ");
            System.out.print(table[i][j] + " ");
            counter++;
        }
        System.out.println();
    }

    }
}
