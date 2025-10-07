import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int[] vet = new int[10];
        int i, soma_pon=0, soma_pesos=0;
        double media;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");
        for (i = 0; i < 10; i++) {
            vet[i] = ler.nextInt(); 
        }
        for (i=0; i<10; i++){
            soma_pon += vet[i] * i;
            soma_pesos += i;
        }
        media = soma_pon/soma_pesos;
            System.out.println("A média ponderada é: "+media);
    }
}
