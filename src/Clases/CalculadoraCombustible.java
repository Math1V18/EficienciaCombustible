package Clases;

import javax.swing.JTextField;

/**
 *
 * @author matvi
 */
public class CalculadoraCombustible {
    private Vehiculo vehiculo;

    public CalculadoraCombustible(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void calcularRendimientoMostrar(JTextField  Rendimiento) {
        double rendimiento = vehiculo.calcularRendimientoCombustible();
        Rendimiento.setText( rendimiento + " L/100 km\n");
    }

    public void calcularConsumoMostrar(JTextField  Consumo) {
        double consumo = vehiculo.calcularConsumoCombustible();
        Consumo.setText( consumo + " L/Km\n");
    }
}

