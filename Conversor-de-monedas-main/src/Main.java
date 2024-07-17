
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EXTERNA:
        while(true){
            System.out.println("Conversor Challenge");
            System.out.println("1 -- Rupia India a Dolares\n"
            + "2 -- Yen Japones a Dolares\n"
            + "3 -- Rublo Ruso a Dolares\n"
            + "4 -- Salir");
            System.out.print("INGRESE UNA OPCION VALIDA: ");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);
            
            switch (opcion){
                case '1':
                    convertir (83.57," Rupia India");
                    break;
                case '2':
                    convertir (158.64, "Yen Japones");
                    break;
                case '3':
                    convertir (88.43, "Rublo Ruso");
                    break;
                case '4':
                    System.out.println("Saliendo del conversor");
                    break EXTERNA;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
    static void convertir(double cantidadDolar, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de monedas o billetes :", pais);
        double cantidadMoneda = leer.nextDouble();
        
        double dolares = cantidadMoneda / cantidadDolar;
        dolares = (double) Math.round(dolares * 100d)/100;
        System.out.println("----------------------------------------------");
        System.out.println("|    Tienes la cantidad $"+dolares+"Dolares estadounidenses    |");
        System.out.println("----------------------------------------------");
        
    }
}
