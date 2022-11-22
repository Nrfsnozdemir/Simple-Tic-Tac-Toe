import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//
//        for (int i = 1; i <= input; i++) {
//            int result = i * i;
//            if (result <= input) {
//                System.out.println(result);
//            } else {
//                break;
//            }
//
//        }

        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }

        System.out.println(Arrays.toString(array)); // output the array

    }
}