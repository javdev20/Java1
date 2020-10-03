package Урок4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class prev {


    public static void main(String[] args) {
        char[] sharps = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
        String[] secrets = {"apple", "banana", "truck"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your word...");

        String secret = secrets[new Random().nextInt(secrets.length)];
        System.out.println(secret);
        String guessWord = scanner.next().toLowerCase();
        char[] bufferedSharps = Arrays.copyOf(sharps, sharps.length);

        if (guessWord.equals(secret)) {
             bufferedSharps = guessWord.toCharArray();
        } else {
            /**
             * Option #1
             */
//            for (int i = 0; i < secret.length() && i < guessWord.length(); i++) {
//                if (guessWord.charAt(i) == secret.charAt(i)) {
//                    bufferedSharps[i] = guessWord.charAt(i);
//                }
//            }

            /**
             * Option #2
             */
            for (int i = 0; i < guessWord.length(); i++) {
                for (int j = 0; j < secret.length(); j++) {
                    if (guessWord.charAt(i) == secret.charAt(j)) {
                        bufferedSharps[j] = guessWord.charAt(i);
                    }
                }
            }
        }

        for (int i = 0; i < bufferedSharps.length; i++) {
            System.out.print(bufferedSharps[i]);
        }
        System.out.println();
    }
}

