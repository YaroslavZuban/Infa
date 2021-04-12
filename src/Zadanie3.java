import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a=4;

        System.out.print("Введите n= ");
        int n=scanner.nextInt();

        double result=1/a;

        while (n>=1){
            result+=1/Math.pow(a,2*n);
            n--;
        }

        System.out.print("Результат равен: "+result);
    }
}
