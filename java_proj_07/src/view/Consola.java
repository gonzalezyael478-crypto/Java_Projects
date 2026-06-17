package view;
//import java.util.Scanner;
import javax.swing.JOptionPane;
import model.Persona;

public class Consola {
    public static void main(String[] args) {
        //Scanner lector = new Scanner(System.in); // Tecla
        String nombre = JOptionPane.showInputDialog("Escribe el nombre de la persona");
        Persona per = new Persona(nombre);
        
        do { 
            try {
            String entrada = JOptionPane.showInputDialog("Intriduzca el peso de " + nombre);
            per.setPeso(Double.parseDouble(entrada));
            break;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                                          "Porfavor Introduzca un número entero o decimal!",
                                          "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        } while (true);
        
        
        
        do { 
            try {
            String entrada2 = JOptionPane.showInputDialog("Introduzca la estatura de " + nombre);
            per.setEst(Double.parseDouble(entrada2));  
            break; 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                                              "Porfavor Introduzca un número entero o decimal!",
                                              "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        } while (true);
        
        
        per.definiEst();

        JOptionPane.showMessageDialog(null, per);
    }
}
