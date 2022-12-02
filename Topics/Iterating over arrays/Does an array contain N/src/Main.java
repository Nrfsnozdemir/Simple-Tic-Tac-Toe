import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        boolean result = false;

        for (int each : array) {
            if (each == num) {
                result = true;
            }
        }
        System.out.println(result);
    }
}