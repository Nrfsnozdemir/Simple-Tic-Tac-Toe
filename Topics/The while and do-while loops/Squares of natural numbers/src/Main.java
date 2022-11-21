import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            int result = i * i;
            if (result <= input) {
                System.out.println(result);
            } else {
                break;
            }

        }
    }
}