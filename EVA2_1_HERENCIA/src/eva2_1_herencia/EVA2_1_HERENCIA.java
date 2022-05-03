/* NOTAS DE MOFICADORES DE AACCESO:
* protected: MISMO PAQUETE Y POR HERENCIA
* private: BLOQUEA TODO, FUERA DE LA CLASE NO SE PUEDE VER NADA
* public: VISIBLE PARA TODOS 
* default: EN EL MISMO PAQUETE NADA MAS

PROTECTED tiene impacto sobre las clases que herede 
      PROTECTED Una clase en el mismo paquete puede ver esos protected
    protected String nombre; 
    protected int edad;

 */
package eva2_1_herencia;

/**
 *
 * @author Diana
 */
public class EVA2_1_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //persona per1 = new persona ();
        //per1.
        Estudiante est1 = new Estudiante("Sofia", 18, "21550301");
        ///est1.setNombre("Sofia");
        //est1.setEdad(18);
        //est1.setNumcontrol("21550301");
        //est1.mostrarNombre();
        est1.imprimirDatos();
        
        Maestro mae1 = new Maestro ("Angel", 35, 999);
        mae1.imprimirDatos();
    }
    
}

class Maestro extends persona { //Subclase maestro
    //No. de registro
    private int numregistro;
    
    //constructor default
    public Maestro (){
        super();
        System.out.println("CLASE MAESTRO");
    }
    //constructor que recibe parametros
    public Maestro (String nombre, int edad, int numregistro){
        super(nombre, edad);
        this.numregistro = numregistro;
    }
    //metodos get/set

    public int getNumregistro() {
        return numregistro;
    }

    public void setNumregistro(int numregistro) {
        this.numregistro = numregistro;
    }
    @Override
    public void imprimirDatos (){
        super.imprimirDatos();
        System.out.println("No. de registro:" + numregistro);
    }
}


class Estudiante extends persona{ //subclase (hijo)
    private String numcontrol;

    //constructor default
    public Estudiante (){
        super (); //llamada al constructor de superclase
        System.out.println("CLASE ESTUDIANTE");
    }
    
    //constructor que recibe parametros
    public Estudiante (String nombre, int edad, String numcontrol){
        super(nombre, edad);//llamada al constructor de superclase
        this.numcontrol =numcontrol;
    }
    
    //metodos get/set
    public String getNumcontrol() {
        return numcontrol;
    }

    public void setNumcontrol(String numcontrol) {
        this.numcontrol = numcontrol;
    }
    /*public void mostrarNombre (){
        System.out.println("Nombre del estudiante:" + getNombre());
    }*/
    
    //Override = ingnorar  //super permite acceder a todos los datos de la superclase
    @Override
    public void imprimirDatos(){
        super.imprimirDatos(); //Llamando al metodo imprimidatos de superclase en persoan
        System.out.println("No. de control:" + numcontrol);
    }
}


class persona { //superclase (padre)
    
    private String nombre; 
    private int edad;

    //constructor default/ sin parametros
    public persona() {
        this.nombre = "XXXXX";
        this.edad = 10000;
        System.out.println("CLASE PERSONA");
    }

    //constructor con parametros
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
   
    //metodos get/set
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
        System.out.println("Edad:" + edad);
    }
}