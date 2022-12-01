package ejecutable;

import controlador.Controlador;
import modelo.Banco;
import modelo.Cuentaahorros;
import modelo.Cuentacorriente;
import modelo.Cuentalibreta2022;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
       

        VentanaPrincipal miVentana = new VentanaPrincipal();
        Banco miBanco = new Banco();
        Controlador miControlador = new Controlador(miVentana, miBanco);
    }    
}