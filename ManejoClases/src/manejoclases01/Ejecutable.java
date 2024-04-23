/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro ";
        hospital.numeroCamas = 5;
        hospital.presupuesto = 50340.43;
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.1f\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto);
        
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
    }
}
