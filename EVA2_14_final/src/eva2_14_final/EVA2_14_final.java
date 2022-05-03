/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_final;

/**
 *
 * @author Diana
 */
public class EVA2_14_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}

//class EstudiantePosgrado extends Estudiante{
    



 final class Estudiante extends Persona{
    private String Num_control;

    public Estudiante() {
    }

    public Estudiante(String Num_control, String nombre) {
        super(nombre);
        this.Num_control = Num_control;
    }

    public String getNum_control() {
        return Num_control;
    }

    public void setNum_control(String Num_control) {
        this.Num_control = Num_control;
    }
    
    
}

class Persona {

    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
