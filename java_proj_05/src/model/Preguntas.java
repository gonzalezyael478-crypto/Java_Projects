package model;

import java.util.*;


public class Preguntas {
    protected String texto;
    protected String resCorrecta;
    protected List<String> opciones;

    public Preguntas(String texto, String resCorrecta, List<String> opcionesIncorrectas) {
        this.texto = texto;
        this.resCorrecta = resCorrecta;
        this.opciones = new ArrayList<>(opcionesIncorrectas);
        opcionesIncorrectas.add(resCorrecta);
    }

    public String getTexto() {return texto;}
    public String getResCorrecta() {return resCorrecta;}

    public List<String> getOpcionesMezcladas() {
        List<String> mezcladas = new ArrayList<>(this.opciones);
        Collections.shuffle(mezcladas);
        return mezcladas;
    }
}