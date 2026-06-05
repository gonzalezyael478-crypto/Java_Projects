package service;

import java.util.ArrayList;
import model.*;

public class BibliotecaService {
    private ArrayList<MaterialBibliografico> materiales;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Prestamo> prestamos;

    public BibliotecaService() {
        materiales = new ArrayList<>();
        alumnos = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    // ── Materiales ──────────────────────────────────────────────
    public void agregarMaterial(MaterialBibliografico m) {
        materiales.add(m);
        System.out.println("Material agregado: " + m.getTitulo());
    }

    public void mostrarMateriales() {
        if (materiales.isEmpty()) {
            System.out.println("No hay materiales registrados.");
            return;
        }
        System.out.println("\n=== MATERIALES REGISTRADOS ===");
        for (MaterialBibliografico m : materiales) {
            System.out.println(m.mostrarInfo());
        }
    }

    public MaterialBibliografico buscarMaterialPorCodigo(String codigo) {
        for (MaterialBibliografico m : materiales) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) return m;
        }
        return null;
    }

    // ── Alumnos ──────────────────────────────────────────────────
    public void registrarAlumno(Alumno a) {
        alumnos.add(a);
        System.out.println("Alumno registrado: " + a.getNombre());
    }

    public void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }
        System.out.println("\n=== ALUMNOS REGISTRADOS ===");
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }

    public Alumno buscarAlumnoPorMatricula(String matricula) {
        for (Alumno a : alumnos) {
            if (a.getMatricula().equalsIgnoreCase(matricula)) return a;
        }
        return null;
    }

    // ── Préstamos ────────────────────────────────────────────────
    public boolean realizarPrestamo(String matricula, String codigoMaterial,
                                    String fechaPrestamo, String fechaDevolucion) {
        Alumno alumno = buscarAlumnoPorMatricula(matricula);
        if (alumno == null) {
            System.out.println("Error: alumno con matrícula '" + matricula + "' no encontrado.");
            return false;
        }
        MaterialBibliografico material = buscarMaterialPorCodigo(codigoMaterial);
        if (material == null) {
            System.out.println("Error: material con código '" + codigoMaterial + "' no encontrado.");
            return false;
        }
        if (!material.isPuedePrestarse()) {
            System.out.println("Error: el material '" + material.getTitulo() + "' no se puede prestar.");
            return false;
        }
        if (!material.isDisponible()) {
            System.out.println("Error: el material '" + material.getTitulo() + "' no está disponible.");
            return false;
        }
        material.setDisponible(false);
        Prestamo p = new Prestamo(fechaPrestamo, fechaDevolucion, alumno, material);
        prestamos.add(p);
        System.out.println("Préstamo registrado correctamente.");
        return true;
    }

    public void mostrarPrestamos() {
        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
            return;
        }
        System.out.println("\n=== PRÉSTAMOS REGISTRADOS ===");
        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }
}
