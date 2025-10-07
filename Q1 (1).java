import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] vet = new int[10];
        int i;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");
        for (i = 0; i < 10; i++) {
            vet[i] = ler.nextInt(); 
        }
        System.out.println("\nPares:");
        for (i = 0; i < 10; i++) {
            if (vet[i] % 2 == 0) {
                System.out.println(vet[i]);
            }
        }

        System.out.println("\nÍmpares:");
        for (i = 0; i < 10; i++) {
            if (vet[i] % 2 != 0) {
                System.out.println(vet[i]);
            }
        }
    }
}
