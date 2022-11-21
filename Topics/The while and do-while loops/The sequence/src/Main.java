import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int inputSize = scanner.nextInt();
        int input;

        while (inputSize != 0) {
            input = scanner.nextInt();
            if (input % 4 == 0 && input >= max) {
                max = input;
            }
            inputSize--;
        }

        System.out.println(max);
    }
    }
