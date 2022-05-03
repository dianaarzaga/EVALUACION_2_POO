/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_metodos_abstractos;

/**
 *
 * @author Diana
 */
public class EVA2_10_METODOS_ABSTRACTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class ImplementaAbstracto extends claseAbstracta{

    @Override
    public void metodoAbstracto() {
    }
    
}

//Metodo abstracto: sin cuerpo (sin implementacion, sin llaves)
abstract class claseAbstracta{
    public void metodoImplementado(){
        System.out.println("Metodo implementado");
    }
    
    public abstract void metodoAbstracto();
}