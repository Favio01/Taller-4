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
public class Vuelo {
    private int distancia;
    private int pasajerosAdultos;
    private int pasajerosNiños;
    private int pasajeroAdultoMayor;
    
    public Vuelo (int distancia){
        this.distancia = distancia;
    }

    public Vuelo(int distancia, int pasajerosAdultos, int pasajerosNiños, int pasajeroAdultoMayor) {
        this.distancia = distancia;
        this.pasajerosAdultos = pasajerosAdultos;
        this.pasajerosNiños = pasajerosNiños;
        this.pasajeroAdultoMayor = pasajeroAdultoMayor;
    }
    
    
    public void Distancia(int Distancia){
        this.distancia = Distancia;
    }
    
    public int CostoKilometro(){
        int Distancia = this.distancia;
        int Costo;
        
        Costo= 523 * distancia;
        
        return Costo;
    }
    
    public double Descuento(){
        int Distancia = this.distancia;
        int costo = CostoKilometro();
        double Descuento = 0;
        
        if ((Distancia > 1030) && (pasajerosAdultos > 3)){
            Descuento = 0.10;  
        }
        if ((pasajerosAdultos == 2) && (pasajerosNiños == 1)){
            Descuento = 0.08;
        }
        if ((pasajeroAdultoMayor > 0) && (Descuento <= 0.10)){
            Descuento = 0.25;
        }else{
         Descuento = 0.50;   
        }
        if (costo > 550000){
            Descuento = Descuento + 0.20;
        }
        return Descuento;
    }
    public double CostoViaje(){
        double descuento = Descuento();
        int costoKilometro = CostoKilometro();
        double CostoViaje;
        
        CostoViaje = costoKilometro * descuento;
        return CostoViaje;
    }
}
