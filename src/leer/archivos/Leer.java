package leer.archivos;

import java.io.*;

public class Leer {
    public String LeerArchivo(String direccion){
        String texto= "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp= "";
            String bfRead;
            while ( (bfRead = bf.readLine()) != null){
            temp = temp +bfRead;
        }
            texto = temp;
            
        }
        catch(Exception e){
            
        }
    return texto;    
    }
    
}
