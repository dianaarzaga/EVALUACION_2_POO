/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_herencia_3;

/**
 *
 * @author Diana
 */
public class EVA2_3_HERENCIA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal animal = new Animal();
        //animal.mover();
        //Vertebrado vert = new Vertebrado();
        //vert.esqueleto();
        //Mamifero mam = new Mamifero();
       // mam.pelo();
       //primates prim = new primates();
       //prim.dedos();
       humano hum = new humano();
       hum.pensar();
        
    }
}
    class humano  extends primates{
        public humano (){
            System.out.println("HUMANOS");
        }
        public void pensar(){
            System.out.println("Pensar");
        }
    }

    class primates extends Mamifero{
         public primates (){
            System.out.println("PRIMATES");
        }
        public void dedos(){
            System.out.println("Sujetar objetos");
        }
    }

    class Mamifero extends Vertebrado{
         public Mamifero (){
            System.out.println("MAMIFERO");
        }
        public void pelo(){
            System.out.println("tiene pelo");
        }
    }

    class Vertebrado extends Animal{
        public Vertebrado (){
            System.out.println("VERTEBRADO");
        }
        public void esqueleto(){
            System.out.println("tiene esqueleto");
        }
    }
    
    class Animal{
        
        public Animal(){
            System.out.println("ANIMAL");
        }
        public void mover(){
            System.out.println(" tiene movimiento");
        }
    }
    
    
    
    
    

