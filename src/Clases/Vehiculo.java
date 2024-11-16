package Clases;

/**
 *
 * @author matvi
 */
public class Vehiculo {
    private double distanciaRecorrida; // Distancia recorrida en kilómetros
    private double cantidadCombustible; // Cantidad de combustible consumido en litros

    
    // Constructor para inicializar los atributos
    public Vehiculo(double distanciaRecorrida, double cantidadCombustible) {
        this.distanciaRecorrida = distanciaRecorrida;
        this.cantidadCombustible = cantidadCombustible;
    }

    // Método para calcular el rendimiento de combustible (L/100 km)
    public double calcularRendimientoCombustible() {
        if (distanciaRecorrida == 0) {
            return 0;
        }
        return ((cantidadCombustible / distanciaRecorrida) * 100);
    }
    
    // Método para calcular el consumo de combustible (L/km)
    public double calcularConsumoCombustible() {
        if (distanciaRecorrida == 0) {
            return 0;
        }
        return (cantidadCombustible / distanciaRecorrida);
    }

    // Getters y setters para los atributos
    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public double getCantidadCombustible() {
        return cantidadCombustible;
    }

    public void setCantidadCombustible(double cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }
    // Método para obtener el rendimiento de combustible con 4 decimales
    public String obtenerRendimientoCombustibleCon4Decimales() {
    double rendimiento = calcularRendimientoCombustible();
    // Formatear el rendimiento a 4 decimales
    String rendimientoFormateado = String.format("%.4f", rendimiento);
    return rendimientoFormateado + " L/100 km";
    }
}

