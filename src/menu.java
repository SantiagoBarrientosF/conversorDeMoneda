import java.util.Scanner;

public class conversorDeMonedas {
    public void ConversionDeMonedas() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            var monedaBase = scanner.nextLine();
            System.out.println("""
                    Bienvenida al conversor de monedas, Por favor selecciona una de las sgtes opciones
                    1). Peso Colombiano ====> Dolar
                    2). Peso Mexicano ====> Dolar
                    3). Peso Argentino ====> Dolar
                    4). Sol Peruano ====> Dolar
                    5). Euro ====> Dolar
                    6). Dolar ====> Euro
                    7). Real Brasileño ====> Dolar
                    Por favor Ingrese el numero de la opción que necesite
                    """);
            if ("exit".equals(scanner.nextLine())) {
                break;

            }
        }
    }
}