package semana5;

public class Avion extends Transporte implements ISistemaElectrico{
    
    private double gas =0;
    
    @Override
    public String encender(double gas){
        String msg;
        this.gas = gas;
        if(this.gas>1)
            msg = "El avion esta encendido";
        else
            msg = "";
     return msg;
            }
      
}
