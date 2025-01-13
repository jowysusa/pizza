import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner scanear = new Scanner(System.in);
        cuenta cuenta = null;
        int opcion;

        do {
            System.out.println("menu ");
            System.out.println(" 1. crear nueva cuenta");
            System.out.println("2. imprimir datos en la cuenta  ");
            System.out.println("3. establecer nueva cantidad");
            System.out.println("4. salir ");
            opcion = scanear.nextInt();
            scanear.nextLine();
            if (opcion == 1) {
                System.out.print("introduce el nombre del titular  ");
                String titular = scanear.nextLine();
                System.out.print(" introduce la cantidad ");
                double cantidad = scanear.nextDouble();
                cuenta = new cuenta(titular, cantidad);
                System.out.println("cuenta creada ");
            } else if (opcion == 2) {

                if (cuenta != null) {
                    System.out.println(cuenta);
                } else {
                    System.out.println("no hay cuenta creada");
                }
            } else if (opcion == 3) {
                if (cuenta != null) {
                    System.out.print("introduce nueva cantidad ");
                    double nueva = scanear.nextDouble();
                    cuenta.setCantidad(nueva);
                    System.out.println("cantidad actualizada");
                }
            } else if (opcion == 4) {
                System.out.println("salir ");
            }
        } while (opcion != 4);

    }
}
