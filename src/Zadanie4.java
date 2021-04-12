import java.util.Random;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        System.out.println("Укажем размер матрицы:");

        System.out.print("Количество строк: ");
        int m=scanner.nextInt();

        System.out.print("Количество столбцов: ");
        int n=scanner.nextInt();

        int [][] matrix=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= random.nextInt(20)+7;
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();

        }

        for(int i=0;i<m;i++){
            int sum=0;

            for(int j=0;j<n;j++){
                sum+=matrix[i][j];
            }
            System.out.println("Сумма "+(i+1)+" строчки:"+sum);

        }
    }
}
