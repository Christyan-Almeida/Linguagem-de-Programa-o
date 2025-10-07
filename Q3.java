import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        int[] vet = new int[10];
        int i;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        vet[0] = ler.nextInt();
        for (i = 1; i < 10; i++) {
            vet[i] = vet [i - 1] * 2;
        }
        for (i=0; i<10; i++){
            System.out.println(+vet[i]);
        }
    }
}
