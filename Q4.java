import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        double[] N = new double[100];
        int i;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        N[0] = ler.nextInt();
        for (i = 1; i < 100; i++) {
            N[i] = N[i - 1] / 2;
        }
        for (i=0; i<100; i++){
            System.out.println(+N[i]);
        }
    }
}
