import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 2; i < size; i++) {
            if (array[i - 1] - array[i - 2] == 1 && array[i] - array[i - 1] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}