package csvReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Need to find out how tr get the path required to find value of csv file.
		
		
        String path = "C:\\Users\\USER\\Desktop\\java\\crime1.csv";
        String line = " ";
        //FileReader fr = new FileReader(path);
        try(BufferedReader br = new BufferedReader(new FileReader(path));)
        {
        //String value [] = {};
        	while( (line = br.readLine()) != null)
            {
               String[] value  = line.split(",");
               System.out.println("Date = "+value[0]); 
            }
        
        }catch(FileNotFoundException e)
        {
        	System.out.println("File Not Found");
        }catch(IOException e)
        {
        	System.out.println("Input OutPut Exception Not Found");
        }
        
       }
}
