import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

      Scanner captura = new Scanner(System.in);
      System.out.println("Ingrese la estación (primavera, verano, otoño o invierno): ");
      String estacion = captura.next();

        switch (estacion) {
            case "primavera" -> System.out.println("La estación es primavera");
            case "verano" -> System.out.println("La estación es verano");
            case "otoño" -> System.out.println("La estación es otoño");
            case "invierno" -> System.out.println("La estación es invierno");
            default -> System.out.println("Eso no es una estación");
        }

    }

}
