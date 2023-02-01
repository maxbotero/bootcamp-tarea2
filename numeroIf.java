import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner captura = new Scanner(System.in);
       System.out.println("Ingrese un número: ");
       int numeroIf = captura.nextInt();

       if(numeroIf > 0){
           System.out.println("es un numero positivo");
       } else if (numeroIf < 0) {
           System.out.println("es un numero negativo");
       } else {
           System.out.println("es un cero");
       }
    }
}
