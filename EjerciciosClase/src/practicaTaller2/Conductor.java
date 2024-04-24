
package practicaTaller2;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Conductor {
   

    private String name;
    private String licenceType;
    private String age; // anio que nacio
    private String licenceType;
    

    public Scanner in;
    
    
    public Conductor(){
    
        in = new Scanner(System.in);
}
   
    public Conductor(String color, int speed, int traction){
        this.color=color;
        this.speed=speed;
        this.traction=traction;
        in = new Scanner(System.in);
        System.out.printf("Color del coche: %s , velocidad: %d km/h , traccion: %d\n",color,speed,traction);
    }
    

    public void setColor(String color) {
        this.color=color; 
    }
    
    public void validarVehiculo(int llantas){
        switch (llantas) {
            case 1: this.name="moto";
            this.licenceType="B";
            case 2: this.name="Tricimoto";
            case 3: this.name="Carro/camioneta";
            case 4:this.name="Camion/trailer";
                break;
            default: System.out.println("Su vehiculo no tiene suficientes llantas");
                throw new AssertionError();
    
}
    }
}
