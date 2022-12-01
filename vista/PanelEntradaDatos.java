package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------

    private JLabel lbConsignar;
    private JTextField tfConsignar;


    //------------------------
    //Metodos
    //------------------------

    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);


        //Creación y adición
        lbConsignar = new JLabel("Digite cantidad= ");
        lbConsignar.setBounds(0,90,100,20);
        add(lbConsignar);


        //Creación y adición de campos de texto
        tfConsignar = new JTextField("");
        tfConsignar.setBounds(100, 90, 260, 20);
        add(tfConsignar);


        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    //Metodos de acceso a la información de las cajas de texto
    public String getAgregarLibro()
    {
        return tfConsignar.getText();
    }

    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfConsignar.setText("");
    }
}