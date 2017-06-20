
/**
 * Write a description of class Vendedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vendedor
{
   int horas;
   int ventas;
   
    public void Horas(int horas){
        this.horas = horas;
    }
    
    public int HoraNormal(){
        int horas = this.horas;
        int horaNormal;
        
        if(horas > 40){
            horaNormal = 40;   
        }else{
            horaNormal = horas;
        }
        return horaNormal;
    }
    
    public int HorasExtras(){
        int horas = this.horas;
        int horasExtras = 0;
        
        if(horas > 40){
            horasExtras = horas - 40;   
        }
        return horasExtras;
    }
    
    public int SalarioNormal(){
        int horaNormal = HoraNormal();
        int horasExtra = HorasExtras();
        int SalarioHoraNormal;
        int SalarioHoraExtra;
        int SalarioNormal = 0;
        
        SalarioHoraNormal = horaNormal * 2000;
        SalarioHoraExtra = horasExtra * 3000;
        SalarioNormal = SalarioHoraNormal + SalarioHoraExtra;
        
        return SalarioNormal;
    }
    
    public void Ventas(int ventas){
        this.ventas = ventas;
    }
    
    public double BonificacionVenta(){
        int ventas = this.ventas;
        double bonificacion = 0;
        
        if((ventas > 300000) && (ventas <= 500000)){
            bonificacion = ventas * 0.05;
        }else
        if(ventas > 500000){    
            bonificacion = ventas * 0.10;
        }
        
        return bonificacion;
    }
    public double SalarioTotal(){
        int SalarioNormal = SalarioNormal();
        double bonificacion = BonificacionVenta();
        double SalarioTotal;
        
        SalarioTotal = SalarioNormal +  bonificacion;
        
        
        return SalarioTotal;
    }
}
