import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > array[max]) {
                max = i;
            }
        }
        System.out.println(max);
    }
}