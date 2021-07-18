package view;

import model.Curso;

public class Vista {
    public static void main(String[] args) {
        Curso cursoFrances = new Curso(52441, "Frances 101", 'N', 123, "David Perez");
        Curso cursoItaliano = new Curso(52441, "Italiano 102", 'T', 234, "Carlos Hernandez");

        
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println(cursoFrances.getCodigo());
        System.out.println(cursoFrances.getNombre());
        System.out.println(cursoFrances.getJornada());
        System.out.println(cursoFrances.getFormador().getNombre());
        System.out.println(cursoFrances.getFormador().getCodigo());
        
        System.out.println("-------------------------------------------------------------------");

        System.out.println(cursoItaliano.getCodigo());
        System.out.println(cursoItaliano.getNombre());
        System.out.println(cursoItaliano.getJornada());
        System.out.println(cursoItaliano.getFormador().getNombre());
        System.out.println(cursoItaliano.getFormador().getCodigo());
        System.out.println("-------------------------------------------------------------------");
        /*Modificar nombre a curso Frances*/
        //cursoFrances.setNombre("hola");
        //System.out.println(cursoFrances.getNombre());
        //System.out.println(cursoItaliano.getNombre());
    }
}
