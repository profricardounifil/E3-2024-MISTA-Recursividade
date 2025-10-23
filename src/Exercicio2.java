import java.util.Scanner;

public class Exercicio2 {

//    public static double calcularPotenciaRecursivo(int n) {//n = 0
//        if(n == 0) {
//            return 1;
//        }
//        if(n > 0) {
//            return calcularPotenciaRecursivo(n-1)*2;
//        } else {
//            return calcularPotenciaRecursivo(n+1)*0.5;
//        }
//    }

    public static double calcularPotenciaRecursivo(int n) {//n = 0
        if(n == 0) {
            return 1;
        }
        if(n > 0) {
            return calcularPotenciaRecursivo(n-1)*2;
        } else {
            n = n*(-1);
            return 1/(calcularPotenciaRecursivo(n-1)*2);
        }
    }

    public static void calcularPotencia(int n) {
        double resultado = 1;
        if(n >= 0) {
            for (int i = 0; i < n; i++) {
                resultado = resultado*2;
            }
        } else {
            for (int i = n; i != 0; i++) {
                resultado = resultado*2;
            }
            resultado = 1/resultado;
        }
        System.out.println("O resultado da potência é: " + resultado);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Informe o valor de n: ");
        n = scanner.nextInt();
        System.out.println(calcularPotenciaRecursivo(n));
    }
}
