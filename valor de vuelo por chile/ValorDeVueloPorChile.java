/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valor.de.vuelo.por.chile;
import java.util.Scanner;
/**
 *
 * @author note
 */
public class ValorDeVueloPorChile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int personas;
        int distancia;
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los kilometros del viaje");
        distancia = sc.nextInt();
    
        System.out.println("Ingrese la cantidad de pasajeros en el vuelo");
        personas = sc.nextInt();
        int pasajeros [] = new int[personas];
        
        Pasajero pasajeros1 = new Pasajero(personas);
        
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese edad del pasajero " + (i+1));
            pasajeros[i] = sc.nextInt();
        }
        pasajeros1.EdadPasajero(pasajeros);
        
        System.out.println("Datos de los pasajeros: ");
        System.out.println("Cantidad de pasajeros adultos en el viaje: " + pasajeros1.CantAdulto());
        System.out.println("Cantidad de pasajeros menores de 16 en el viaje: " + pasajeros1.CantNiños());
        System.out.println("Cantidad de pasajeros adulto mayor en el viaje: " + pasajeros1.CantAdultoMayor());
        
        int pasajeroAdulto = pasajeros1.CantAdulto();
        int pasajeroNiño = pasajeros1.CantNiños();
        int pasajeroAdultoMayor = pasajeros1.CantAdulto();
        
        Vuelo viaje = new Vuelo(distancia, pasajeroAdulto, pasajeroNiño, pasajeroAdultoMayor);
        
        System.out.println("El descuento por el viaje es: " + viaje.Descuento());
        System.out.println("El monto a pagar por el viaje es: " + viaje.CostoViaje());
    } 
}
