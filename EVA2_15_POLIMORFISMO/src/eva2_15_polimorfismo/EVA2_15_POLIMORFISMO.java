/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_polimorfismo;

/**
 *
 * @author Diana
 */
public class EVA2_15_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    class persona{
        private String nombre;
        private int edad;

        public persona() {
        }

        public persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
        
        
    }
    
    class estudiante extends persona{
        private String No_control;

        public estudiante() {
        }

        public estudiante(String No_control, String nombre, int edad) {
            super(nombre, edad);
            this.No_control = No_control;
        }

        public String getNo_control() {
            return No_control;
        }

        public void setNo_control(String No_control) {
            this.No_control = No_control;
        }
        
        
    }
    
    class maestro extends persona{
        private int No_registro;

        public maestro() {
        }

        public maestro(int No_registro, String nombre, int edad) {
            super(nombre, edad);
            this.No_registro = No_registro;
        }

        public int getNo_registro() {
            return No_registro;
        }

        public void setNo_registro(int No_registro) {
            this.No_registro = No_registro;
        }
        
        
        
    }
}
