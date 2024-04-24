
package practica1;

/**
 *
 * @author utpl
 */
public class Principal {
    
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("verde", 80,45 );
        
        int llantas = vehiculo.in.nextInt();
        vehiculo.validarVehiculo(llantas);

        // Le damos un color por parte del usuario
        String color = vehiculo.in.nextLine();
        vehiculo.setColor(color);
        // Obtenemos el color del vehiculo
        System.out.println(vehiculo.getColor());
        
        
        System.out.println(vehiculo.getName());
    }
}
