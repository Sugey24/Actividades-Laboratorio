package semana5;

public class Automovil extends Transporte implements ISistemaElectrico{
    
    private double gas =0;
    
    @Override
    public String encender(double gas){
        String msg;
        this.gas = gas;
        if(this.gas>1)
            msg = "Automovil Encendido";
        else
            msg = "Sin Gasolina";
     return msg;
            }
    
    @Override
    public void apagar(){
     System.out.println("Automovil apagado");
    }
    
    @Override
    public String encenderLuces(){
      return "Luces encendidas";
    }
}
