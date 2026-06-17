package view;

import javax.swing.*;
import java.awt.*; //Abstract Window ToolKit
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.Border;

import model.Persona;

public class FormularioPersona extends JFrame{
    // Componentes de entrada
    private JTextField txtNombre, txtEstatura, txtPeso; // Caja de texto para ingresar datos
    private JButton btnCalcular;

    // Constructor de la clase de FormularioPersona
    public FormularioPersona(){
        // Configuración de la ventana
        setTitle("Datos de la persona para IMC"); // Titulo de la ventna
        setSize(500, 250); // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cuando se cierre la ventana}
        setLocationRelativeTo(null); //Para que no pida que algo sea relativo a algo
        setResizable(false); // Ya no permite redimencionar la ventana

        // Definir tipo de diseño BorderLayout
        setLayout(new BorderLayout(10, 10));

        //Se agrega un panel para los componentes del Formulario
        JPanel panelCaptura = new JPanel(new GridLayout(4, 2, 5, 5));
        panelCaptura.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));

        panelCaptura.add(new JLabel("Nombre: ")); // Agrega la etiqueta al panel de captura
        txtNombre = new JTextField(); // Crea la caja de texto
        panelCaptura.add(txtNombre); // La agrega al panel de captura

        panelCaptura.add(new JLabel("Peso: ")); // Agrega la etiqueta al panel de captura
        txtPeso = new JTextField(); // Crea la caja de texto
        panelCaptura.add(txtPeso); // La agrega al panel de captura

        panelCaptura.add(new JLabel("Estatura: ")); // Agrega la etiqueta al panel de captura
        txtEstatura = new JTextField(); // Crea la caja de texto
        panelCaptura.add(txtEstatura); // La agrega al panel de captura

        panelCaptura.add(new Label("")); // La "J" antes del "Label" pone el texto en Negrita
        btnCalcular = new JButton("Calcular IMC");
        panelCaptura.add(btnCalcular);

        // Manejo del evento Action
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Evento del Botón
                    calcular();
                    
                    
            }
            
        });

        add(panelCaptura, BorderLayout.NORTH); // Pone los componentes en la parte de arriba



    }

    private void calcular(){
        String nom = txtNombre.getText().trim();
        Double peso = 0.0;
        Double est = 0.0;

        if (txtNombre.getText().trim().isEmpty() || txtPeso.getText().trim().isEmpty() || txtEstatura.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "No puedes dejar ningún campo vacío.",
            "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }else
            do { 
                try {
                    peso = Double.parseDouble(txtPeso.getText().trim());
                    break; // Para que salga de el do While
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Ingresa un numero valido en el peso!!", "Error!!", JOptionPane.ERROR_MESSAGE);
                    return; // Para que salga de la funcion
                }
            } while (true);

            do { 
                try {
                    est = Double.parseDouble(txtEstatura.getText().trim());
                    break;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Ingresa un numero valido en la estatura!!", "Error!!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } while (true);

            Persona p1 = new Persona(nom, peso, est);
            p1.calcularImc();
            p1.definiEst();
            JOptionPane.showMessageDialog(this, p1.toString());
            
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new FormularioPersona().setVisible(true);;
        });
    }
}
