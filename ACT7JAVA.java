package act7java;

import java.util.Arrays;
import java.util.Scanner;

public class ACT7JAVA {
    int n;

    public static void main(String[] args) {
        ACT7JAVA programa = new ACT7JAVA();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de n:");
        programa.n = scanner.nextInt();

        int[] primos = programa.calcularPrimos(programa.n);
        int[] fibonacci = programa.calcularFibonacci(programa.n);

        System.out.println("Números primos:");
        programa.imprimirArreglo(primos);

        System.out.println("Sucesión de Fibonacci:");
        programa.imprimirArreglo(fibonacci);
    }

    public int[] calcularPrimos(int n) {
        int[] primos = new int[n];
        int contador = 0;
        int candidato = 2;

        while (contador < n) {
            if (esPrimo(candidato)) {
                primos[contador] = candidato;
                contador++;
            }
            candidato++;
        }

        return primos;
    }

    public boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int[] calcularFibonacci(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }

    public void imprimirArreglo(int[] arreglo) {
        System.out.print(arreglo[0]);

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] != 0) {
                System.out.print(", " + arreglo[i]);
            }
        }

        System.out.println();
    }
}
