public class Program {
    public static void main(String[] args) {
        double[][] table = {{-400, -0.8, -1.9, -1.1},
                {-300, -0.1, -0.05, 0},
                {0,-1400, -2300, -1800}};

        double[] result = new double[2];
        double[][] table_result;

        Simplex S = new Simplex(table);

        table_result = S.Calculate(result);

        System.out.println("Решенная симплекс-таблица:");
        for (int i = 0; i < table_result.length; i++) {
            for (int j = 0; j < table_result[i].length; j++) {
                System.out.print(table_result[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Решение:");

        System.out.println("X[1] = " + result[0]);
        System.out.println("X[2] = " + result[1]);
        System.out.println();
    }
}

