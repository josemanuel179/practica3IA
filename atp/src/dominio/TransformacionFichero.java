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

    public void copiarFile(String fileName) { 
        try { 
        	Files.copy(Paths.get(fileName), Paths.get("./test_data/test.arff"), 
        		StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e) { 
            System.out.println("Exception occoured" + e); 
        }
    }

    public void borrarFile(String fileName) { 
        try { 
        	Files.deleteIfExists(Paths.get(fileName));
        }
        catch (IOException e) { 
            System.out.println("Exception occoured" + e); 
        }
    }
}
