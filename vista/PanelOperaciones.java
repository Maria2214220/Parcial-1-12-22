package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btConsignarButton;
    private JButton btRetirarButton;
    private JButton btSalir;

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar boton AgregarVendedor
        btConsignarButton = new JButton("Consignar ");
        btConsignarButton.setBounds(10,20,170,20);
        btConsignarButton.setActionCommand("consigne aqui");
        this.add(btConsignarButton);

        //Crear y agregar boton Agregar autor
        btRetirarButton = new JButton("Retirar");
        btRetirarButton.setBounds(10,50,170,20); 
        btRetirarButton.setActionCommand("retire aqui");
        this.add(btRetirarButton);


        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(190,50,170,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btConsignarButton.addActionListener(pAL);
        btRetirarButton.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }


}