import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;
        int max = 0;
        do {
            value = scanner.nextInt();
            if (value > max) {
                max = value;
            }
        } while (value != 0);

        System.out.println(max);
    }
}