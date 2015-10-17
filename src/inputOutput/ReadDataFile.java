
/**
 *
 * @author Evan Glazer
 */
package inputOutput;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadDataFile 
{
    Scanner inputFile;
    String dataFileName;
    ArrayList data = new ArrayList();
    
    public ReadDataFile(String fileName)
    {
        dataFileName = fileName; 
    }
    
    public void populateData()
    {
        try
        {
            URL url = getClass().getResource(dataFileName);
//            URL url = getClass().getResource(dataFileName);
            File file = new File(url.toURI());

            inputFile = new Scanner(file);
            
            while(inputFile.hasNext())
            {
                data.add(inputFile.next());
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
            ex.printStackTrace();
        }
        finally
        {
            inputFile.close();
        }
    }    
    
    public ArrayList getData()
    {
        return data;
    }
}