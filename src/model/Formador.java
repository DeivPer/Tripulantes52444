package model;

public class Formador {
    private String nombre;
    private int codigo;

    public Formador(String nombre, int codigo) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    public int getCodigo() {
        return codigo;
    }
}
