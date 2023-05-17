/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Jorman
 */
public class JDConsulta extends JDialog {

    private JLabel lbPlaca, lbPrecioKm, lbKmRenta, lbKmDev, lbTipoVehiculo;
    private JLabel lbPrecioDia, lbFechaRenta, lbFechaDev;

    private JTextField txtPlaca, txtPrecioKm, txtKmRenta, txtKmDevolucion;
    private JFormattedTextField txtPrecioDia, txtFechaRenta, txtFechaDevolucion;
    
    private JComboBox cmbTipoVehiculo;

    private Container contenedor;

    private JTable tabla;

    public JDConsulta(Frame owner, String title) {
        super(owner, title);
        this.initComponentes();
    }

    private void initComponentes() {
        this.contenedor = this.getContentPane();
        this.contenedor.setLayout(new BorderLayout());
        this.panelDatos();
        this.panelBotones();
        this.tablaDatos();

        //this.setSize(400, 200);
        this.pack();
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void panelBotones() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 5, 5));

        JPanel panelAux = new JPanel();
        panelAux.add(panel);

        panelAux.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

        this.contenedor.add(panelAux, BorderLayout.EAST);
    }

    private void panelDatos() {
        this.lbPlaca = new JLabel("Placa: ");
        this.lbTipoVehiculo = new JLabel("Tipo vehiculo: ");
        
        this.txtPlaca = new JTextField();
        this.cmbTipoVehiculo = new JComboBox();
        this.cmbTipoVehiculo.addItem("Automovil");
        this.cmbTipoVehiculo.addItem("Tractor");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 5, 5));
        
        panel.add(this.lbPlaca);
        panel.add(this.txtPlaca);
        
        panel.add(this.lbTipoVehiculo);
        panel.add(this.cmbTipoVehiculo);
        
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        this.contenedor.add(panel, BorderLayout.CENTER);
    }

    private void tablaDatos() {

        String columnas[] = {"PLACA", "TIPO", "PRECIO X KM", "KM DE RENTA", "KM DE DEVOLUCION", "PRECIO POR DIA", "FECHA DE RENTA", "FECHA DE DEVOLUCION"};
        String datos[][] = {
            {"ABC123", "Automóvil", "10.50", "100", "90", "50.00", "2023-05-01", "2023-05-05"},
            {"DEF456", "Tractor", "15.75", "200", "180", "75.00", "2023-05-02", "2023-05-06"},
            {"GHI789", "Automóvil", "5.25", "50", "40", "25.00", "2023-05-03", "2023-05-07"},
            {"ABC123", "Automóvil", "10.50", "100", "90", "50.00", "2023-05-01", "2023-05-05"},
            {"DEF456", "Tractor", "15.75", "200", "180", "75.00", "2023-05-02", "2023-05-06"},
            {"GHI789", "Automóvil", "5.25", "50", "40", "25.00", "2023-05-03", "2023-05-07"}
                
        };
        JTable tabla = new JTable(datos, columnas);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }
}
