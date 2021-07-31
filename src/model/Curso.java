package model;

import java.util.ArrayList;

public class Curso {
    
    /*Constantes*/

    public final static int MAXIMO_TRIPULANTES = 5;


    /*Atributos*/

    private int codigo;
    private String nombre;
    private char jornada;

    private Formador formador;

    private ArrayList<Tripulante> tripulantes;

    
    /*Constructor*/

    public Curso(int pCodigo, String pNombre, char pJornada, int fCodigo, String fNombre) {
        super();
        this.codigo = pCodigo;
        this.nombre = pNombre;
        this.jornada = pJornada;
        formador = new Formador(fNombre, fCodigo);
        tripulantes = new ArrayList<>();
    }


    
    /*getters*/
    
    public ArrayList<Tripulante> getTripulantes() {
        return tripulantes;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public char getJornada() {
        return jornada;
    }
    
    public Formador getFormador() {
        return formador;
    }
    
    /*setters*/
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setJornada(char jornada) {
        this.jornada = jornada;
    }
    

    /*Metodos*/

    public String agregarTripulante(Tripulante t) {
        if (tripulantes.size() == MAXIMO_TRIPULANTES){
            return "No se pueden agregar mas de " + MAXIMO_TRIPULANTES + "Tripulantes";
        }
       tripulantes.add(t);
        return "Tripulante agregado al curso " + nombre;
    }

    public double calcularPromedioCurso() throws Exception {
        if (tripulantes.size() == 0) {
            throw new Exception("No hay tripulantes registrados en el curso");
        }
        double total = 0.0;
        for (Tripulante tripulante : tripulantes) {
            total += tripulante.getAverage();
        }
        return total / tripulantes.size();
    }


}
