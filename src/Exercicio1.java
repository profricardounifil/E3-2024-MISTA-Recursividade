import java.util.Scanner;

public class Exercicio1 {

    public static int somarAcumulativamenteRecursivo3(int numeroNatural) {
        if(numeroNatural == 0) {
            return 0;
        }
        return somarAcumulativamenteRecursivo3(numeroNatural-1) + numeroNatural;
    }

    public static void somarAcumulativamenteRecursivo2(int numeroNatural, int soma) {
        if(numeroNatural == 0) {
            System.out.println(soma);
            return;
        }
        soma = soma + numeroNatural;
        numeroNatural--;
        somarAcumulativamenteRecursivo2(numeroNatural, soma);
    }

    public static void somarAcumulativamenteRecursivo(int numeroNatural, int i, int soma) {
        if (i > numeroNatural) {
            System.out.println("Valor da soma: " + soma);
            return;
        }
        soma = soma + i;
        i++;
        somarAcumulativamenteRecursivo(numeroNatural, i, soma);
    }

    public static void somarAcumulativamente(int numeroNatural) {
        int soma = 0;
        for (int i = 0; i <= numeroNatural; i++) {
            soma = soma + i;
        }
        System.out.println("A soma acumulativa de " + numeroNatural + " é igual a: " + soma);
    }


    public static void main(String[] args) {
        int numeroNatural;
        Scanner sc = new Scanner(System.in);
        int resultado;

        System.out.println("Informe um número natural para realizar a soma acumulativa: ");
        numeroNatural = sc.nextInt();
        resultado = somarAcumulativamenteRecursivo3(numeroNatural);
        System.out.println(resultado);

    }
}
