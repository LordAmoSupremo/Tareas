
package juegocartas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cliente {

    public static void main(String[] args) throws IOException {
        Deck deck = new Deck();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = -1;
        while (opcion != 0) {
            opcion = showMenu(br);
            switch (opcion) {
                case 1:
                    deck.shuffle();
                    break;
                case 2:
                    deck.head();
                    break;
                case 3:
                    deck.pick();
                    break;
                case 4:
                    deck.hand();
                    break;
                case 0:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    public static int showMenu(BufferedReader br) throws IOException {
        System.out.println("Bienvenido a Poker!");
        System.out.println("Selecciona una opción:");
        System.out.println("1 Mezclar deck");
        System.out.println("2 Sacar una carta");
        System.out.println("3 Carta al azar");
        System.out.println("4 Generar una mano de 5 cartas");
        System.out.println("0 Salir");
        System.out.print("Opción seleccionada: ");
        return Integer.parseInt(br.readLine());
    }
}
