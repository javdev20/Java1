
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
public class test {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char[][] field = getField();
        
        int x = doPlayerMove(scanner, 'X');
        int y = doPlayerMove(scanner, 'Y');
        
        field[x][y] = 'X';
        drawField(field);
    }
    
    static int doPlayerMove(Scanner sc, char coordName) {
        int coord;
        do {
            System.out.println(String.format("Please input %s - coordinate in range [1,3]", coordName));
            coord = sc.nextInt() - 1;
        } while (coord < 0 || coord > 2);
        return coord;
    }
    static char[][] getField() {
        return new char[][] {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };
    }
    
    static void drawField(char[][] field) {
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
