/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_arreglos;

/**
 *
 * @author Diana
 */
public class EVA2_11_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Arreglos:
        //Fila o columna de excel
        //Almacenan datos del mismo tipo
        //Se pueden acceder por indices
        //Java: primer posicion --> 0, ultima cantidad de elementos -1
        //Java: arreglos son objetos
        int [] arreglo = new int [10];//arreglo con 10 enteros
        //como los usamos?
        arreglo [0] = 100;//el arreglo en la posicion 0, se le asigna 10
        System.out.println("El valor de arreglo [0] =" + arreglo[0]);
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
        arreglo[6] = 700;
        arreglo[7] = 800;
        arreglo[8] = 900;
        arreglo[9] = 1000; //ultima posicion
        System.out.println(arreglo);
        System.out.println("Tamaño del arreglo:" + arreglo.length);
        //arreglo[10] = 200; //aqui nos pasamos del arreglo
        String[] arraCade = new String [10];
        arraCade[5] = "Hola mundo";
        double [] arraDouble = new double [1000000];
        arraDouble [999999] = 0.2;
        persona [] clasePOO = new persona [32]; //arreglo para 32 objetos de tipo persona
    }
    
}

class persona{
    private String nombre;

    public persona() {
    }

    public persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}