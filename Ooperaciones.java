import java.util.Scanner;
public class Ooperaciones {
     
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     
         System.out.println("Favor de introducir el primer número:"); 
            int N1= sc.nextInt();
         System.out.println("Favor de introducir el segundo número:"); 
            int N2=sc.nextInt();

       System.out.println("X = " + N1);
        System.out.println("Y = " + N2);
        System.out.println("Suma: " + (N1+N2));
        System.out.println("Resta: " + (N1-N2));
        System.out.println("Multiplicación: " + (N1*N2));
        System.out.println("División: " + (N1/N2));
        System.out.println("Módulo: " + (N1%N2)); 
         sc.close();
     }
}
        

