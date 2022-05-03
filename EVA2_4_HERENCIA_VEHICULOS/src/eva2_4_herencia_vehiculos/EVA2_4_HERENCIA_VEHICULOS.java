/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_herencia_vehiculos;

/**
 *
 * @author Diana
 */
public class EVA2_4_HERENCIA_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Vehiculos veh = new Vehiculos ();
        veh.imprimirDatos();
        Motocicletas moto = new Motocicletas ();
        moto.Mot();
        moto.imprimirDatos();
        Automoviles auto = new Automoviles();
        auto.Aut();
        auto.imprimirDatos();
        Camionetas cami = new Camionetas();
        cami.Cam();
        cami.imprimirDatos();
        Camiones cms = new Camiones ();
        cms.Camion();
        cms.imprimirDatos();
    }
    
}
class Camiones extends Vehiculos{
     private String CapaCarga;
    private String NumEjes;
    private String CapPasajero;

    public Camiones() {
      System.out.println("CAMIONES");  
    }
    public void Camion (){
        System.out.println("CARACTERISTICAS: Capacidad de carga, Nuemro de ejes, Capacidad de pasajeros");
    }

    public Camiones(String CapaCarga, String NumEjes, String CapPasajero) {
        this.CapaCarga = CapaCarga;
        this.NumEjes = NumEjes;
        this.CapPasajero = CapPasajero;
    }

    public String getCapaCarga() {
        return CapaCarga;
    }

    public void setCapaCarga(String CapaCarga) {
        this.CapaCarga = CapaCarga;
    }

    public String getNumEjes() {
        return NumEjes;
    }

    public void setNumEjes(String NumEjes) {
        this.NumEjes = NumEjes;
    }

    public String getCapPasajero() {
        return CapPasajero;
    }

    public void setCapPasajero(String CapPasajero) {
        this.CapPasajero = CapPasajero;
    }
     @Override
    public void imprimirDatos (){
        super.imprimirDatos();
          
    }
    
}
class Camionetas extends Vehiculos{
    private String CapaCarga;
    private String Equipamiento;
    private String Transmision;

    public Camionetas() {
         System.out.println("CAMIONETAS");
    }
    public void Cam (){
        System.out.println("CARACTERISTICAS: Capacidad de carga, Equipamiento, Transmision");
    }

    public Camionetas(String CapaCarga, String Equipamiento, String Transmision) {
        this.CapaCarga = CapaCarga;
        this.Equipamiento = Equipamiento;
        this.Transmision = Transmision;
    }

    public String getCapaCarga() {
        return CapaCarga;
    }

    public void setCapaCarga(String CapaCarga) {
        this.CapaCarga = CapaCarga;
    }

    public String getEquipamiento() {
        return Equipamiento;
    }

    public void setEquipamiento(String Equipamiento) {
        this.Equipamiento = Equipamiento;
    }

    public String getTransmision() {
        return Transmision;
    }

    public void setTransmision(String Transmision) {
        this.Transmision = Transmision;
    }
    @Override
    public void imprimirDatos (){
        super.imprimirDatos();
          
    }
}
class Automoviles extends Vehiculos{
    private String TipoVehiculo;
    private String Equipamiento;
    private String Transmision;

    public Automoviles() {
        System.out.println("AUTOMOVILES");
    }
    public void Aut (){
        System.out.println("CARACTERISTICAS: Tipos de vehiculos, Equipamiento, Transmision");
    }

    public Automoviles(String TipoVehiculo, String Equipamiento, String Transmision) {
        this.TipoVehiculo = TipoVehiculo;
        this.Equipamiento = Equipamiento;
        this.Transmision = Transmision;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    public String getEquipamiento() {
        return Equipamiento;
    }

    public void setEquipamiento(String Equipamiento) {
        this.Equipamiento = Equipamiento;
    }

    public String getTransmision() {
        return Transmision;
    }

    public void setTransmision(String Transmision) {
        this.Transmision = Transmision;
    }

    @Override
    public void imprimirDatos (){
        super.imprimirDatos();
          
    }
    
    
    
    
    
}
class Motocicletas extends Vehiculos{
    private String TiposMotocicletas;
    private String Manubrios;
    private String Sist_marcha;
    
   
    public Motocicletas (){
        System.out.println("MOTOCICLETAS");
    }
    public void Mot (){
        System.out.println("CARACTERISTICAS: Tipos de motocicletas, Manubrios, Sistema de marcha");
    }

    public Motocicletas(String TiposMotocicletas, String Manubrios, String Sist_marcha) {
        this.TiposMotocicletas = TiposMotocicletas;
        this.Manubrios = Manubrios;
        this.Sist_marcha = Sist_marcha;
    }

    public String getTiposMotocicletas() {
        return TiposMotocicletas;
    }

    public void setTiposMotocicletas(String TiposMotocicletas) {
        this.TiposMotocicletas = TiposMotocicletas;
    }

    public String getManubrios() {
        return Manubrios;
    }

    public void setManubrios(String Manubrios) {
        this.Manubrios = Manubrios;
    }

    public String getSist_marcha() {
        return Sist_marcha;
    }

    public void setSist_marcha(String Sist_marcha) {
        this.Sist_marcha = Sist_marcha;
    }
    @Override
    public void imprimirDatos (){
        super.imprimirDatos();
        
    }
    
    
    
    
}
class Vehiculos{
    //atributos
    private String combustible;
    private int llantas;
    private int motor;
    private int cilindros;
    private int pasajeros;
    private String marca;
    private String modelo;
    private int año;
    
   //constructor default
    public Vehiculos() {
    this.combustible = "";
    this.llantas = 0;
    this.motor = 0;
    this.cilindros = 0;
    this.pasajeros = 0;
    this.marca = "";
    this.modelo = "";
    this.año = 0;
    System.out.println("VEHICULOS");
    }
    
    
   
    //constructor parametros
    public Vehiculos(String combustible, int llantas, int motor, int cilindros, int pasajeros, String marca, String modelo, int año) {
        this.combustible = combustible;
        this.llantas = llantas;
        this.motor = motor;
        this.cilindros = cilindros;
        this.pasajeros = pasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        
    }
    
    //metodos get-set
    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void imprimirDatos (){
        System.out.println("Combustible:" + combustible + ", Num.llantas:" + llantas + ", Capacidad motor:" + motor +
                "\n Cilindros:" + cilindros + ", Capacidad pasajeros:" + pasajeros +  
                "\n , Marca:" + marca + ", Modelo:" + modelo + ", Año:" + año);
    }
} 