package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Empleado;

public class FormularioEmpleado extends JFrame {

    // Componentes de entrada
    private JTextField txtNombre, txtEdad, txtSueldo;
    private JButton btnGuardar;
    
    // Componente de visualización
    private JTextArea txtAreaVisor;
    private int contadorEmpleados = 1; // Para enumerar los registros

    public FormularioEmpleado() {
        // Configuración de la ventana
        setTitle("Registro e Historial de Empleados");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Diseño principal: BorderLayout
        setLayout(new BorderLayout(10, 10));

        // --- PANEL SUPERIOR (Formulario de captura) ---
        JPanel panelCaptura = new JPanel(new GridLayout(4, 2, 5, 5));
        panelCaptura.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));

        panelCaptura.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelCaptura.add(txtNombre);

        panelCaptura.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panelCaptura.add(txtEdad);

        panelCaptura.add(new JLabel("Sueldo:"));
        txtSueldo = new JTextField();
        panelCaptura.add(txtSueldo);

        btnGuardar = new JButton("Guardar Empleado");
        panelCaptura.add(new JLabel("")); // Espacio en blanco para alinear el botón
        panelCaptura.add(btnGuardar);
        
        // Agregar el panel de captura en la zona NORTE (arriba)
        add(panelCaptura, BorderLayout.NORTH);

        // --- PANEL INFERIOR (Visualizador / JTextArea) ---
        JPanel panelVisualizador = new JPanel(new BorderLayout());
        panelVisualizador.setBorder(BorderFactory.createTitledBorder("Empleados Registrados"));

        // Inicializar el JTextArea
        txtAreaVisor = new JTextArea();
        txtAreaVisor.setEditable(false); // Evita que el usuario borre o escriba ahí manualmente
        txtAreaVisor.setFont(new Font("Monospaced", Font.PLAIN, 12)); // Fuente clara para datos

        // Envolver el JTextArea en un JScrollPane para activar barras de scroll
        JScrollPane scrollPane = new JScrollPane(txtAreaVisor);
        panelVisualizador.add(scrollPane, BorderLayout.CENTER);

        // Agregar el panel del visor en la zona CENTRO / SUR
        add(panelVisualizador, BorderLayout.CENTER);

        // Evento del botón
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarYRegistrar();
            }
        });
    }

    private void validarYRegistrar() {
        // 1. Validar campos vacíos
        if (txtNombre.getText().trim().isEmpty() || 
            txtEdad.getText().trim().isEmpty() || 
            txtSueldo.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String nombre = txtNombre.getText().trim();
        int edad = 0;
        double sueldo = 0.0;

        // 2. Validar entero en Edad
        try {
            edad = Integer.parseInt(txtEdad.getText().trim());
            if (edad <= 0) {
                JOptionPane.showMessageDialog(this, "La edad debe ser mayor a 0.", "Edad Inválida", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La edad debe ser un número entero válido.", "Error de Tipo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 3. Validar decimal en Sueldo
        try {
            sueldo = Double.parseDouble(txtSueldo.getText().trim());
            if (sueldo < 0) {
                JOptionPane.showMessageDialog(this, "El sueldo no puede ser negativo.", "Sueldo Inválido", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El sueldo debe ser un número decimal válido.", "Error de Tipo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 4. Si todo es correcto, crear el objeto Empleado
        Empleado nuevoEmpleado = new Empleado(nombre, edad, sueldo);

        // 5. ¡Visualizar en el Text Area! 
        // Usamos .append() para agregar texto al final del JTextArea sin borrar lo anterior
        txtAreaVisor.append(contadorEmpleados + ". " + nuevoEmpleado.toString() + "\n");
        contadorEmpleados++; // Incrementamos el número de lista

        // 6. Mensaje de éxito rápido y limpiar cajas de texto
        JOptionPane.showMessageDialog(this, "¡Empleado agregado al historial!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtSueldo.setText("");
        txtNombre.requestFocus(); // Pone el cursor de nuevo en el nombre listo para escribir
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FormularioEmpleado().setVisible(true);
        });
    }
}