
package practicaTaller2;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author USUARIO
 */
public class Conductor {
   

    private String name;
    private String licenceType;
    private int age; // anio que nacio
    private int licenceYear;
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

    public int getLicenceYear() {
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

    public void setLicenceYear(int licenceYear) {
        this.licenceYear = licenceYear;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    
    public void validarEdad(){
        if (this.getAge()<18) {
            System.out.println("Usted sera multado, es menor de edad");  
            multas++;
        } else {
            System.out.println("Usted es mayor de edad. No hay problemas.");
        }
    }
    public void validarTipoLicencia(String vehicle, String licenceType){
        switch (vehicle.toLowerCase()) {
            case "moto":
                if (!licenceType.equals("A")){
                    System.out.println("Usted sera multado!.Por conducir un vehiculo no facultado por su tipo de Licencia!"); 
                    multas++;
                } else{
                    System.out.println("Licencia Valida! :) . Buen chofer!");
                }
                
                break;
            case "carro":
                if (!licenceType.equals("B")){
                    System.out.println("Usted sera multado!.Por conducir un vehiculo no facultado por su tipo de Licencia!"); 
                    multas++;
                }  else{
                    System.out.println("Licencia Valida! :) . Buen chofer!");
                }
                break;
            case "camioneta":
                if (!licenceType.equals("B")){
                    System.out.println("Usted sera multado!.Por conducir un vehiculo no facultado por su tipo de Licencia!"); 
                    multas++;
                } else{
                    System.out.println("Licencia Valida! :) . Buen chofer!");
                }
                break;
            case "buseta":
                if (!licenceType.equals("C")){
                    System.out.println("Usted sera multado!.Por conducir un vehiculo no facultado por su tipo de Licencia!"); 
                    multas++;
                } else{
                    System.out.println("Licencia Valida! :) . Buen chofer!");
                }
                break;
            case "taxi":
                if (!licenceType.equals("E")){
                    System.out.println("Usted sera multado!.Por conducir un vehiculo no facultado por su tipo de Licencia!"); 
                    multas++;
                } else{
                    System.out.println("Licencia Valida! :) . Buen chofer!");
                }
                break;
            default:
                System.out.println("Tipo de Licencia falso. No mienta o sera multado!!!.");;
                break; // What changing it to @continue@ will do ?
        }
    }

    public void validarAñoLicencia() {
        int currentYear=obtenerAñoActual(); // Supongamos que todas las licencias tienen una vigencia de 5 años a partir de su expedicion.
        if (this.getLicenceYear()<currentYear-5){
            System.out.println("Su licencia ha caducado. Usted la ha usado por mas de 5 años. Sera multado");
            multas++;
        } else {
            System.out.println("Su licencia aun esta vigente. Felicitaciones!");
                    
        }
    }
    
    public int obtenerAñoActual(){
        Date today = new Date();
        SimpleDateFormat todayFormat = new SimpleDateFormat("dd/MM/Y");
        String todayString = todayFormat.format(today);
        
        String today3 = todayString.replaceAll("\\d+{2}\\D+{2}","");
        int currentYear = Integer.parseInt(today3);
        return currentYear;
       // RESPALDO, QUIZAS DEBA CAMBIAR EL PROGRAMA SEGUN LO DEMANDE EL PROFE. Sacamos edad en años de la persona
       // System.out.println("Usted tiene: "+(currentYear-age)+" años");
    }
    public void showMultas(){ // Solo de ser necesario cambiaria este metodo por un getter. (Pues hasta aqui llega el programa y no hay necesidad de reutilizar el codigo de presentar las multas
        System.out.println((multas==0)?"Usted tiene "+ multas+ " multas. Cielos Que macizo!":"Usted tiene "+ multas+ " multas.\nAcerquese a la ANT para que sepa cuanto debe de pagar. Jeje 😉");           
    }// if ternariazo jiji.
    }


    

