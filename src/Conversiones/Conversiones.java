package Conversiones;

import Api.conexionALaApi;

public class Conversiones {
    private final conexionALaApi api = new conexionALaApi();
    public double convertirOpcion(String opcion, double monto) throws Exception {
        return switch (opcion) {
            case "1" -> convertirMoneda(monto, "COP", "USD");
            case "2" -> convertirMoneda(monto, "MXN", "USD");
            case "3" -> convertirMoneda(monto, "ARS", "USD");
            case "4" -> convertirMoneda(monto, "PEN", "USD");
            case "5" -> convertirMoneda(monto, "EUR", "USD");
            case "6" -> convertirMoneda(monto, "USD", "EUR");
            case "7" -> convertirMoneda(monto, "BRL", "USD");
            default -> throw new IllegalArgumentException("Opción no valida");
        };
    }
    private double convertirMoneda(double monto, String base, String destino) throws Exception{
            var datos = api.obtenerTasas(base);
            double tasa = datos.conversion_rates.get(destino);

            return monto * tasa;
        }

}

