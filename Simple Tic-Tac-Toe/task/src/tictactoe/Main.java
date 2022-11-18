package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String symbol = scanner.nextLine();

        System.out.println("---------");
        System.out.println( "| " + symbol.charAt(0) + " " + symbol.charAt(1) + " " +symbol.charAt(2) + " |");
        System.out.println( "| " + symbol.charAt(3) + " " + symbol.charAt(4) + " " +symbol.charAt(5) + " |");
        System.out.println( "| " + symbol.charAt(6) + " " + symbol.charAt(7) + " " +symbol.charAt(8) + " |");
        System.out.println("---------");

        //Scanner sc=new Scanner(System.in);
        //
        //        System.out.println("Enter Cells: ");
        //        String line=sc.nextLine();
        //        char[] ch = line.toCharArray();
        //        System.out.println("---------");
        //        System.out.println("| "+ch[0]+" "+ch[1]+" "+ch[2]+" |");
        //        System.out.println("| "+ch[3]+" "+ch[4]+" "+ch[5]+" |");
        //        System.out.println("| "+ch[6]+" "+ch[7]+" "+ch[8]+" |");
        //        System.out.println("---------");
    }
}
