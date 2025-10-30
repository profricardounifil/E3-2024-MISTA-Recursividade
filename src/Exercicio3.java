import java.util.Scanner;

public class Exercicio3 {

    public static int fibonacciIterativo(int n) {
        int antAnt = 0, ant = 1, resultado = 0;
        if(n < 2) {
            return n;
        } else {
            for (int i = 2; i <= n; i++) {
                resultado = ant + antAnt;
                antAnt = ant;
                ant = resultado;
            }
        }
        return resultado;
    }

    public static int fibonacciRecursivo(int n) {//6
        if(n < 2) {
            return n;
        } else {
            return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número natural para cálculo do Fibonacci: ");
        n = scanner.nextInt();
        System.out.println("O Fib(" + n + ") = " + fibonacciRecursivo(n));
    }
}
