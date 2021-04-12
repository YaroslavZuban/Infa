import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x= ");
        double x = scanner.nextDouble();

        double y;

        if (x >= 0 && x <= 1) {
            y = x;
        } else if (x >= 1 && x <= 2) {
            y = 1;
        } else if (x >= 2 && x <= 3) {
            y = 2 * (-x + 2.5);
        } else if (x >= 3 && x <= 4) {
            y = -1;
        } else if (x >= 4 && x <= 5) {
            y=x-5;
        }else{
            y=0;
        }

        System.out.println("Результат следующий: x= "+x+"   y= "+y);
    }
}
