/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_herencia_e_interfaces;

/**
 *
 * @author Diana
 */
public class Estudiante extends Persona implements MuestraDatos{
    private String numControl;

    public Estudiante() {
        super(); //constructor defautl de persona 
        this.numControl = "";
    }

    public Estudiante(String numControl, String nombre, int edad) {
        super(nombre, edad); // constructor de persona (superclase)
        this.numControl = numControl;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre:" + getNombre ());
        System.out.println("Edad:" + getEdad ());
        System.out.println("No. de control:" + numControl);
    }
    
    
    
}
