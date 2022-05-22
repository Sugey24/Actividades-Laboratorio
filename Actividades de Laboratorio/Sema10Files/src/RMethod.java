
import java.io.FileReader;
import java.io.IOException;


public class RMethod {
    public RMethod(String fileN){
     this.rfile(fileN);
    }
    
    private void rfile(String fileN){
      try{
          FileReader fr = new FileReader(fileN);
            int valor = fr.read();
            
            while(valor!=-1){
              System.out.print((char)valor);
              valor=fr.read();
            }
            fr.close();
      }catch(IOException ex){
          System.out.println(ex.getMessage());
      }
      finally{
      }
    } 
}
