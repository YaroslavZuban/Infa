import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Введите в следующие переменные.");

        System.out.print("Значение x= ");
        double x=scanner.nextDouble();

        System.out.print("Значение y= ");
        double y=scanner.nextDouble();

        System.out.print("Значение z= ");
        double z=scanner.nextDouble();

        double result=3*(x+1/(y*Math.pow(x,2))-(7*(z*Math.pow(x,3)+2))/(y*x-1));
        System.out.print("Результат равен следующему: "+result);
    }
}
