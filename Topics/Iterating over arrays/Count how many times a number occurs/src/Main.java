import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int result = 0;
        int n = scanner.nextInt();
        for (int each : array) {
            if (each == n) {
                result++;
            }
        }
        System.out.println(result);
    }
}