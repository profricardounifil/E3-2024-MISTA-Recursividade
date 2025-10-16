import java.util.Scanner;

public class Main {

    public static void contarRegressivamenteRecursivo(int numeroNatural) {//10
        if(numeroNatural < 0 ) {
            return;
        }
        System.out.println(numeroNatural);
        numeroNatural--;
        contarRegressivamenteRecursivo(numeroNatural);
    }

    public static void contarRegressivamente(int numeroNatural) {
        System.out.println("Contagem regressiva do valor informado:");
        while(numeroNatural >= 0) {
            System.out.println(numeroNatural);
            numeroNatural--;
        }

    }

    public static void main(String[] args) {
        int numeroNatural;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número natural: ");
        numeroNatural = scanner.nextInt();
        //contarRegressivamente(numeroNatural);
        contarRegressivamenteRecursivo(numeroNatural);
    }
}