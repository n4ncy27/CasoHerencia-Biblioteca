package vista;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;

public class PanelProceso extends JPanel {
        public JButton btnCrearLibro;
        public JButton btnCrearColeccion;
        public JButton btnImprimir;
        public JButton btnBorrar;
        public JButton btnSalir;

        public PanelProceso() {
                btnCrearLibro = new JButton("Crearlibro");
                btnCrearLibro.setFont(new Font("", Font.PLAIN, 14));
                btnCrearLibro.setForeground(Color.BLACK);
                btnCrearLibro.setBackground(Color.decode("#d5a6bd"));
                btnCrearLibro.setBorder(BorderFactory.createRaisedBevelBorder());
                btnCrearLibro.setBounds(1, 22, 100, 40);
                btnCrearLibro.setActionCommand("crearLibro");

                btnCrearColeccion = new JButton("CrearColección");
                btnCrearColeccion.setFont(new Font("Arial", Font.PLAIN, 14));
                btnCrearColeccion.setForeground(Color.BLACK);
                btnCrearColeccion.setBackground(Color.decode("#d5a6bd"));
                btnCrearColeccion.setBorder(BorderFactory.createRaisedBevelBorder());
                btnCrearColeccion.setBounds(103, 22, 110, 40);
                btnCrearColeccion.setActionCommand("crearColeccion");

                btnImprimir = new JButton("Imprimir");
                btnImprimir.setFont(new Font("Arial", Font.PLAIN, 14));
                btnImprimir.setForeground(Color.BLACK);
                btnImprimir.setBackground(Color.decode("#d5a6bd"));
                btnImprimir.setBorder(BorderFactory.createRaisedBevelBorder());
                btnImprimir.setBounds(215, 22, 100, 40);
                btnImprimir.setActionCommand("imprimirLibros");

                btnBorrar = new JButton("Borrar");
                btnBorrar.setFont(new Font("Arial", Font.PLAIN, 14));
                btnBorrar.setForeground(Color.BLACK);
                btnBorrar.setBackground(Color.decode("#d5a6bd"));
                btnBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
                btnBorrar.setBounds(320, 22, 100, 40);
                btnBorrar.setActionCommand("borrarTexto");

                btnSalir = new JButton("Salir :(");
                btnSalir.setFont(new Font("Arial", Font.PLAIN, 14));
                btnSalir.setForeground(Color.BLACK);
                btnSalir.setBackground(Color.decode("#d5a6bd"));
                btnSalir.setBorder(BorderFactory.createRaisedBevelBorder());
                btnSalir.setBounds(425, 22, 100, 40);
                btnSalir.setActionCommand("cerrarVentana");

                 //Borde y titulo del panel
                 TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
                 borde.setTitleColor(Color.WHITE);
                this.setBorder(borde);

                this.setLayout(null);
                this.setBackground(Color.decode("#98715d"));
                this.setVisible(true);
                this.add(btnCrearLibro);
                this.add(btnCrearColeccion);
                this.add(btnImprimir);
                this.add(btnBorrar);
                this.add(btnSalir);
        }
}
