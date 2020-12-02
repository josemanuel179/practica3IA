import java.io.*; 
  
public class AppendStrFile { 
  
    public static void appendStrToFile(String fileName, String str) 
    { 
        try { 
              BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true)); 
            out.write(str); 
            out.close(); 
        } 
        catch (IOException e) { 
            System.out.println("exception occoured" + e); 
        } 
    } 