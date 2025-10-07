import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        long a = 0;
        long b = 1;
        long fib = 0;
        int i;
        System.out.print("Digite o índice para o número de Fibonacci: ");
        n = scanner.nextInt();

        if (n < 0) {
            System.out.println("O índice não pode ser negativo.");
        } else {
            
            
            for (i = 0; i < n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            System.out.println("Número de Fibonacci na posição " + n + " é: " + (n == 0 ? a : fib));
        }
    }
}
