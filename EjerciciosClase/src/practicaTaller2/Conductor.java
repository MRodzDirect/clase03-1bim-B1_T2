
package practicaTaller2;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Conductor {
   

    private String name;
    private String licenceType;
    private int age; // anio que nacio
    private String licenceYear;
    private String vehicle;
    private int multas;
    public Scanner in;
    
    
    public Conductor(){ // Constructor por default
    
        in = new Scanner(System.in);
}
   

        public String getName() {
        return name;
    }

    public String getLicenceType() {
        return licenceType;
    }

    public int getAge() {
        return age;
    }

    public String getLicenceYear() {
        return licenceYear;
    }

    public String getVehicle() {
        return vehicle;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setLicenceType(String licenceType) {
        this.licenceType = licenceType;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLicenceYear(String licenceYear) {
        this.licenceYear = licenceYear;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    
    public void validarEdad(){
        if (age<18) {
            System.out.println("Usted sera multado, es menor de edad");  
            multas++;
        }
    }
    public void validarVehiculo(){
        switch (vehiculo) {
            case "moto":
                this.licenceType="Tipo A";
                break;
            default:
                throw new AssertionError();
        }
    }
    }

