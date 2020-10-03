/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Урок3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Вам даётся 3 попытки угвдать число!");
        playLevel(9);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int input_number = scanner.nextInt();
        if (input_number == 1) {
            playLevel(9);
        } else
            System.out.println("Игра закончена!");
            scanner.close();
    }

    private static void playLevel(int range) {
        Random rand = new Random();
        int x = rand.nextInt(10);
        int i = 0;
        while (i < 3) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == x) {
                System.out.println("Вы выиграли!!!");
                break;
            } else if (input_number > x) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
            i++;
        }
        if (i == 3) {
            System.out.println("Вы проиграли!");
        }
    }
}
