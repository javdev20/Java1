
package homework4;

import java.util.Random;
import java.util.Scanner;


public class Homework4 {
    
    public static char[][] map;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Scanner field = new Scanner(System.in);
    public static int SIZE = 5;
    public static Random rand = new Random();
   
    public static void main(String[] args) {
        System.out.println("Введите размер поля:");
    SIZE = field.nextInt();
    initMap();
    printMap();
    while (true) {
        humanTurn();
        printMap();
        if (checkWin(DOT_X)) {
            System.out.println("Победил человек");
            break;
        }
        if (isMapFull()) {
            System.out.println("Ничья");
            break;
        }
        aiTurn();
        printMap();
        if (checkWin(DOT_O)) {
            System.out.println("Победил Искуственный Интеллект");
            break;
        }
        if (isMapFull()) {
            System.out.println("Ничья");
            break;
        }
    }
    System.out.println("Игра закончена");
    
    }
    
    public static void initMap() {
    map = new char[SIZE][SIZE];
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            map[i][j] = DOT_EMPTY;
            }
        }
    }
    
    public static void printMap() {

    for (int i = 0; i <= SIZE; i++) {
        System.out.print(i + " ");
    }
    System.out.println();
    for (int i = 0; i < SIZE; i++) {
        System.out.print((i + 1) + " ");
        for (int j = 0; j < SIZE; j++) {
            System.out.print(map[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println();
    }
   
    public static void humanTurn() {
    int x, y;
    do {
        System.out.println("Введите координаты в формате X Y");
        x = sc.nextInt() - 1;
        y = sc.nextInt() - 1;
    } while (!isCellValid(x, y));
    map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
    if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
    if (map[y][x] == DOT_EMPTY) return true;
    return false;
    }
    
    public static void aiTurn() {
    int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
    System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
    map[y][x] = DOT_O;
    }

    public static boolean checkWin(char symb) {
        int countH;
        int countV;
        int countDiagonalA = 0;
        int countDiagonalB = 0;

        for (int i = 0; i < SIZE; i++) {
            countH = 0;
            countV = 0;
            
            for (int j = 0; j < SIZE; j++) {
                //tested horizontal check
                if (map[i][j] == symb) {
                countH++;
                if (countH == SIZE) return true;
                }
                
                //tested vertical check
                if (map[j][i] == symb) {
                countV++;
                if (countV == SIZE) return true;
                }
            }
            
            //tested diagonal A "\" check
            if (map[i][i] == symb) {
                countDiagonalA++;
                if (countDiagonalA == SIZE) return true;
            }
            
            //tested diagonal B "/" check
            if (map[i][SIZE - 1 - i] == symb) {
                countDiagonalB++;
                if (countDiagonalB == SIZE) return true; 
            }
        } 
        return false;
    }
    
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
