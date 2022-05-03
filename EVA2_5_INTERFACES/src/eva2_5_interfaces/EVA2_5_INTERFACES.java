/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_interfaces;

/**
 *
 * @author Diana
 */
public class EVA2_5_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona per1 = new persona ();
        per1.setNombre("Sofia");
        per1.setEdad(18);
        per1.imprimirDatos();
        
        Vehiculo veh = new Vehiculo ("ford", "mustang");
        veh.imprimirDatos();
        veh.mostrarMensaje();
        
        //MuestraDatos datos = new MuestraDatos();  NO
    }
    
}

class persona implements muestraDatos{
    private String nombre;
    private int edad;
    
    //cconstructor
    public persona() {
    }

    //constructor con parametros
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
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
    }
}
 
class Vehiculo implements muestraDatos, Mensaje{
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Marca:"+  marca);
        System.out.println("Modelo:" + modelo);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Hola mundo!!");
    }
    
}

interface muestraDatos{
    //solo aceptan metodos publicos
    //solo acepta declaraciones de metodos
    public void imprimirDatos();
}

interface Mensaje{
    public void mostrarMensaje();
}