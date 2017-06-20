/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camino.aleatoreo;

/**
 *
 * @author note
 */
public class Edificio {
    private String edificios [];
    private int moneda[];
    
    public Edificio(){
        this.edificios = new String[6];
    }
    
    public void recorrerEdificios(){
        String edificios[] = {"DC","RA", "R1", "D", "E", "DIS"};
        int moneda;
        int contEdificios = 0;
        
        while (contEdificios <= this.edificios.length){
            System.out.println("Edificio " + edificios[contEdificios]);
            moneda = (int)(Math.random()*2);
            
            if (moneda == 0){
                System.out.println("Cara");
                contEdificios = 6;
                System.out.println("En este edificio me quedo");
                System.out.println("Fin del programa");
            }
            if(moneda == 1){
                System.out.println("Cruz");
                System.out.println("Continuare caminando");
                contEdificios = 0;
            }
            contEdificios++;
        }
        
    }
    
}
