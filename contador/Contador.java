
/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador{ 
    
    final static int contador = 10;
  
    private int finalContador;
   
    public void FinalContador (int finalContador){
        this.finalContador = finalContador;
    }
    
    public void Contador(){
        finalContador = this.finalContador;
        
        for(int i = 1; i <= finalContador; i ++){
            System.out.println("contador: " + i);
        }
        
    }
}
