package service;
import java.util.*;
import model.Preguntas;

public class PreguntaService {

        private List<Preguntas> bancoPreguntas = new ArrayList<>();
        private List<Preguntas> historialCalificaciones = new ArrayList<>();

        public PreguntaService() {
                this.bancoPreguntas = new ArrayList<>();
                this.historialCalificaciones = new ArrayList<>();
                cargarPreguntasDefecto();
        }

        public void cargarPreguntasDefecto() {

        }
        
        public void agregarPreguntas(Preguntas pregunta){
                bancoPreguntas.add(pregunta);

                System.out.println("\nPregunta agregada correctamente.");
        }

        

        public void mostrarPreguntas() {

                if (bancoPreguntas.isEmpty()) {

                        System.out.println("\n No hay preguntas registradas.");
                        return;
                }

                System.out.println("\n===== PREGUNTAS =====");

        }
}
