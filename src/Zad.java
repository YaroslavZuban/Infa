import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Zad {
    public static void main(String[] args) {
        Random random = new Random();

        int[] mass = new int[10];

        for (int i = 0; i < mass.length; i++)  {
            mass[i]=-15+random.nextInt(10);
            System.out.print(mass[i]+" ");
        }

        Arrays.sort(mass);
        System.out.println();

        for (int j : mass) {
            System.out.print(j + " ");
        }
    }
}
