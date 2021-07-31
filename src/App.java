import model.Curso;
import model.Tripulante;
import view.Vista;

public class App {
    public static void main(String[] args) throws Exception {
        Curso programacion1 = new Curso(1234, "Fundamentos de programación", 'M', 7400, "Dev 1");
        System.out.println(programacion1.getNombre());
        try {
            System.out.println(programacion1.calcularPromedioCurso());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Tripulante t = new Tripulante();
        t.setNombre("Primero");
        t.setNota1(4);
        t.setNota2(4.2);
        t.setNota3(5);
        Tripulante t2 = new Tripulante();
        t2.setNombre("Segundo");
        t2.setNota1(4);
        t2.setNota2(4.2);
        t2.setNota3(5);
        Tripulante t3 = new Tripulante();
        t3.setNombre("Tercero");
        t3.setNota1(4.2);
        t3.setNota2(4.1);
        t3.setNota3(3);
        Tripulante t4 = new Tripulante();
        t4.setNombre("Cuarto");
        t4.setNota1(4.3);
        t4.setNota2(4.2);
        t4.setNota3(4.5);
        Tripulante t5 = new Tripulante();
        t5.setNombre("Quinto");
        t5.setNota1(4.4);
        t5.setNota2(3.2);
        t5.setNota3(4);
        programacion1.agregarTripulante(t);
        programacion1.agregarTripulante(t2);
        programacion1.agregarTripulante(t3);
        programacion1.agregarTripulante(t4);
        programacion1.agregarTripulante(t5);
        //for (Tripulante desarrollador : programacion1.getTripulantes()){
        //    System.out.println(desarrollador.getNombre());
        //    System.out.println(desarrollador.getHighNote());
        //}
        //System.out.println(programacion1.calcularPromedioCurso());
        

        Vista v = new Vista();
        v.setVisible(true);
    }
}
