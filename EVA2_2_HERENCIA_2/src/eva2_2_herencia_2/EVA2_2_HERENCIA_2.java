/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_herencia_2;

/**
 *
 * @author Diana
 */
public class EVA2_2_HERENCIA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        direccion direc = new direccion("5ta", 100, "x", "0011", "Chihuahua", "Chih.", "2549665");
        estudiante est1 = new estudiante("2153255", "Diana", 18, direc);
        est1.imprimirDatos();
        
        
    }
    
    
    
}
//Relacion IS A --> estudiante ES UNA persona
class estudiante extends persona {
    private String numcontrol;
    //esto es un objeto pero sin instanciar, se instaciara en el constructor
    private direccion direccion; //HAS A--> estudiante TIENE UNA direccion
    
    public estudiante(){  //(inicializar)
        
        super(); //la llamada a super debe ser (prefernetemente) la primera isntruccion
        this.numcontrol ="";
        //INSTANCIA DE DIRECCION
        direccion = new direccion();
        
        
    }

    public estudiante(String numcontrol, String nombre, int edad, direccion direccion) {
        super(nombre, edad);
        this.numcontrol = numcontrol;
        this.direccion = direccion;
    }

    public String getNumcontrol() {
        return numcontrol;
    }

    public void setNumcontrol(String numcontrol) {
        this.numcontrol = numcontrol;
    }
    
    @Override
    public void imprimirDatos(){
    super.imprimirDatos();
        System.out.println("No.control:" + numcontrol);
        direccion.imprimirdireccion();
    }
    

}

class direccion {
    private String calle;
    private int numero;
    private String colonia;
    private String CP;
    private String ciudad;
    private String estado;
    private String telefono;
    
    //constructor con valores
    public direccion(String calle, int numero, String colonia, String CP, String ciudad, String estado, String telefono) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.CP = CP;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
    }
    
    //constructor default
    public direccion() {
        this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.CP = "";
        this.ciudad = "";
        this.estado = "";
        this.telefono = "";
    }
    
    //metodos get-set

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //imprimirdireccion
    public void imprimirdireccion(){
        System.out.println("Calle:" + calle + ", Numero:" + numero + ", Colonia:" + colonia +
                "\n CP:" + CP + ", Ciudad:" + ciudad + ", Estado:" + estado);
    }
    
    
    
    
    
    
}

class persona{
    private String nombre;
    private int edad;

    //constructor default
    public persona() {
      this.nombre = "";
      this.edad = 0;
    }
    
    //constructor con argumentos
    public persona(String nombre, int edad) {    
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodos get-set
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
    
    public void imprimirDatos(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:"+ edad);
    }
}