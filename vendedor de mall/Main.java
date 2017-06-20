
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
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese horas trabajadas");
        int Horas = sc.nextInt();
        System.out.println("Ingrese monto semanal de ventas");
        int Ventas = sc.nextInt();
        
        Vendedor vendedor = new Vendedor();
        
        vendedor.Horas(Horas);
        
        System.out.println ("Horas normales: " + vendedor.HoraNormal());
        System.out.println ("Horas Extras: " + vendedor.HorasExtras());
        System.out.println ("Salario segun horas normales y horas extra: " + vendedor.SalarioNormal());
        
        vendedor.Ventas(Ventas);
        System.out.println("Monto por bonificacion de venta: " + vendedor.BonificacionVenta());
        System.out.println("Monto Total Semanal: " + vendedor.SalarioTotal());
    }
}
