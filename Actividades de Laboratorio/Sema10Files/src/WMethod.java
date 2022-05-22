import java.io.*;
import java.util.Scanner;

public class WMethod {
    public WMethod(String fileN){
      this.wfiles(fileN);
    }
    
    private void wfiles(String fileN){
     Scanner entrada = new Scanner(System.in);
     String texto;
        try{
            //para escribir en el archivo
            FileWriter fw = new FileWriter(fileN);
            System.out.println("Ingrese un texto aqui");
            texto = entrada.nextLine();
            fw.write(texto);
            /*fw.write("Esto es una prueb");
            fw.write(97);*/
            fw.close();
            
            //leer el archivo e imprimirlo
           /* FileReader fr = new FileReader(fileN);
            int valor = fr.read();
            
            while(valor!=-1){
              System.out.print((char)valor);
              valor=fr.read();
            }
            fr.close();*/
        }catch(IOException ex){
          System.out.println(ex.getMessage());
        }
        finally{
          
        }
    }
}
