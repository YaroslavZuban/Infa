import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер таблицы: ");
        int size = scanner.nextInt();
        getMultiplicationTable(size);
    }

    public static void getMultiplicationTable(int size) {
        int[][] table = new int[size + 1][size + 1];
        int a = 0;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("    |");
                } else if (i == 0) {
                    a++;
                    System.out.printf("%3d", j);

                    if (a == table.length - 1) {
                        System.out.println();

                        for (int k = 0; k <= table.length; k++) {
                            if (k == 0) {
                                System.out.print("¯¯¯¯|");
                            } else {
                                System.out.print("¯¯¯");
                            }
                        }
                    }
                } else if (i == 1 && j >= 1) {
                    System.out.println();
                    System.out.printf("%3d |", j);

                    for (int k = 1; k < table.length; k++) {
                        System.out.printf("%3d", (j * k));
                    }
                }
            }
        }
    }
}
