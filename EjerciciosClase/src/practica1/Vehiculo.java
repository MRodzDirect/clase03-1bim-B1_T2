
package practica1;
import java.util.Scanner;
/**
 *
 * @author Elvis Cocho
 */
public class Vehiculo {
    
    private String color;
    private int speed;
    private int traction;
    private String name;
    public Scanner in;
    
    public Vehiculo(String color, int speed, int traction){
        this.color=color;
        this.speed=speed;
        this.traction=traction;
        in = new Scanner(System.in);
        System.out.printf("Color del coche: %s , velocidad: %d km/h , traccion: %d\n",color,speed,traction);
    }
    
    public void marchar(){
        
    }
    
    public void subirSpeed(){
        
    }
    public void bajarSpeed(){
        
    }
    public void cambiarMarcha(){
        
    }

    public void setColor(String color) {
        this.color=color; 
    }
    
    public void validarVehiculo(int llantas){
        switch (llantas) {
            case 1: this.name="moto";
            case 2: this.name="Tricimoto";
            case 3: this.name="Carro/camioneta";
            case 4:this.name="Camion/trailer";
                break;
            default: System.out.println("Su vehiculo no tiene suficientes llantas");
                throw new AssertionError();
        }/*
        if (llantas==2){
        } else if (llantas==3){
            //System.out.println("Usted tiene una tricimoto,o un cuadron");
            
        } else if (llantas==4){
            //System.out.println("Usted tiene un carro, o camioneta");
            
        } else if (llantas>4){
            //System.out.println("Usted tiene un camion, trailer o coche con mas de 4 llantas");
            
        }*/
    }
    
    public String getName(){
        return this.name;
}

    public String getColor() {
        return this.color; 
    }
    
}
