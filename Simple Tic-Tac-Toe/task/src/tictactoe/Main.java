package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Boolean checkInteger = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String grid = scanner.nextLine();
        char escape = ' ';
        grid = grid.replace('_', ' ');


        char[][] arrList = {
                {grid.charAt(0), grid.charAt(1), grid.charAt(2)},
                {grid.charAt(3), grid.charAt(4), grid.charAt(5)},
                {grid.charAt(6), grid.charAt(7), grid.charAt(8)},
        };
        System.out.println("---------");
        System.out.println("| " + grid.charAt(0) + " " + grid.charAt(1) + " " + grid.charAt(2) + " |");
        System.out.println("| " + grid.charAt(3) + " " + grid.charAt(4) + " " + grid.charAt(5) + " |");
        System.out.println("| " + grid.charAt(6) + " " + grid.charAt(7) + " " + grid.charAt(8) + " |");
        System.out.println("---------");


        while (true) {
            System.out.println("Enter the cordinates: ");

            String cordinate = scanner.nextLine();

            char[] chars = cordinate.toCharArray();

            for (char each : chars) {
                if (Character.isDigit(each)) {
                    checkInteger = true;
                }
            }


            char a = chars[0];
            int firstCordinate2 = a - '0';

            char b = chars[2];
            int secondCordinate2 = b - '0';


            if (checkInteger) {

                if (firstCordinate2 <= 3 && secondCordinate2 <= 3) {
                    if (arrList[firstCordinate2 - 1][secondCordinate2 - 1] == ' ' || arrList[firstCordinate2 - 1][secondCordinate2 - 1] == '_') {
                        arrList[firstCordinate2 - 1][secondCordinate2 - 1] = 'X';
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                    }
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");


                }
            } else {
                System.out.println("You should enter numbers!");
            }
        }


        System.out.println("---------");
        System.out.println("| " + arrList[0][0] + " " + arrList[0][1] + " " + arrList[0][2] + " |");
        System.out.println("| " + arrList[1][0] + " " + arrList[1][1] + " " + arrList[1][2] + " |");
        System.out.println("| " + arrList[2][0] + " " + arrList[2][1] + " " + arrList[2][2] + " |");
        System.out.print("---------");
    }
}