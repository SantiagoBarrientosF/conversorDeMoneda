package Menu;

import Conversiones.Conversiones;

import java.util.Scanner;

public class menu {
    public void conversionDeMonedas() {
        Scanner scanner = new Scanner(System.in);
        Conversiones conversion = new Conversiones();
        while (true) {

            System.out.println("""
                    Bienvenida al conversor de monedas, Por favor selecciona una de las sgtes opciones
                    1). Peso Colombiano ====> Dolar
                    2). Peso Mexicano ====> Dolar
                    3). Peso Argentino ====> Dolar
                    4). Sol Peruano ====> Dolar
                    5). Euro ====> Dolar
                    6). Dolar ====> Euro
                    7). Real Brasileño ====> Dolar
                    
                    Por favor Ingrese el numero de la opción que necesite.
                    Para finalizar el proceso escriba salir
                    """);
            var opcion = scanner.nextLine();
            if ("salir".equals(opcion)) {
                break;
            }
            System.out.println("Ingrese el monto");
            double monto = scanner.nextDouble();

            scanner.nextLine();

            try {
                double resultado = conversion.convertirOpcion(opcion,monto);
                System.out.println("El resultado es:" + resultado + "\n");
            }catch (IllegalArgumentException e){
                System.out.println("Error" + e);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
        }
}
