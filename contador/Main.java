
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Main
{
    public void main(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("ingrese un número entre 1 y 10 ");
    int numero = sc.nextInt();
    Contador contador = new Contador();
    
    
    contador.FinalContador(numero);
    contador.Contador();
}
    
}
