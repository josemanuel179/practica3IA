package dominio;

import java.io.*;
import java.lang.*;
import java.nio.file.*;

public class TransformacionFichero {

	public void copiarFileStr(String fileName, String str) { 
        try { 
        	Files.write(Paths.get(fileName), str.getBytes(), StandardOpenOption.APPEND);
        } 
        catch (IOException e) { 
            System.out.println("Exception occoured" + e); 
        }
    } 
}
