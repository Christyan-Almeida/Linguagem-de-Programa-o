import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para N (2 ≤ N ≤ 5): ");
        int N = scanner.nextInt();


        if (N < 2 || N > 5) {
            System.out.println("Valor inválido para N. O valor deve estar entre 2 e 5.");
            return;
        }


        int[][] matriz = new int[N][N];
        int valor = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = valor++;
            }
        }

        int[][] matrizQuadrada = new int[N][N];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrizQuadrada[i][j] = 0;
                for (int k = 0; k < N; k++) {
                    matrizQuadrada[i][j] += matriz[i][k] * matriz[k][j];
                }
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Quadrado da matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrizQuadrada[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
