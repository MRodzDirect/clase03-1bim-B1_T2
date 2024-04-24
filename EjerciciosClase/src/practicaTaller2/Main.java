
package practicaTaller2;


public class Main {
    
    public static void main(String[] args) {
    Conductor chofer1 = new Conductor(); //
    System.out.println("Ingrese su nombre, tipo de licencia, edad y año de expedicion de licencia");
            
    String name = chofer1.in.nextLine();
    String licenceType = chofer1.in.nextLine();
    String age = chofer1.in.nextLine();
    String licenceYear = chofer1.in.nextLine();
    System.out.println("Ingrese el vehiculo que usted tiene y le comunicaremos si esta sano de multas o debe pagar alguna.");
    String vehicle = chofer1.in.nextLine();
    
    }
 
    
}
