/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valor.de.vuelo.por.chile;

/**
 *
 * @author note
 */
public class Pasajero {
    private int persona;
    private int pasajeros [] = new int [persona];
    
    public Pasajero(int persona){
        this.persona = persona;
    }
    
    public void pasajero(int persona){
        this.persona = persona;
    }
    
    public void EdadPasajero(int []X){
        this.pasajeros = X;
    }
    
    public int CantAdulto(){
        int pasajeros[] = this.pasajeros;
        int cantAdultos = 0;
        for (int i = 0; i < this.persona; i++) {
            if ((pasajeros[i] > 16) && (pasajeros[i] <= 65)) {
                cantAdultos++;
            }
        }
        return cantAdultos;
    }
    
    public int CantNiños(){
        int pasajeros[] = this.pasajeros;
        int cantNiños = 0;
        for (int i = 0; i < this.persona; i++) {
            if (pasajeros[i] < 16) {
                cantNiños++;
            }
        }
        return cantNiños;
    }
    public int CantAdultoMayor(){
        int pasajeros[] = this.pasajeros;
        int cantAdultoMayor = 0;
        for (int i = 0; i < this.persona; i++) {
            if (pasajeros[i] > 65) {
                cantAdultoMayor++;
            }
        }
        return cantAdultoMayor;
        
    }
}
