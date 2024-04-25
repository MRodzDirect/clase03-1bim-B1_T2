
package practicaTaller2;
/*
author → El MRodzDirect 😉
*/
public class Main {
    
    public static void main(String[] args) {
    Conductor chofer1 = new Conductor(); //
    System.out.println("Ingrese su nombre, tipo de licencia, edad y año de expedicion de licencia");
            
    String name = chofer1.in.nextLine();
    String licenceType = chofer1.in.nextLine();
    int age = chofer1.in.nextInt();
    chofer1.setName(name);
    chofer1.setLicenceType(licenceType);
    chofer1.setAge(age);
    // Validamos su edad de inmediato.
    int licenceYear = chofer1.in.nextInt();
    chofer1.setLicenceYear(licenceYear);
    
    chofer1.in.nextLine(); // Limpiamos el Buffer del Scanner
    System.out.println("Ingrese el vehiculo que usted tiene y le comunicaremos si esta sano de multas o debe pagar alguna.");
    String vehicle = chofer1.in.nextLine();
    chofer1.setVehicle(vehicle);
    
    chofer1.validarEdad();
    chofer1.validarTipoLicencia(vehicle,licenceType);
    
    chofer1.validarAñoLicencia();
    
    chofer1.showMultas();
    
}
}
