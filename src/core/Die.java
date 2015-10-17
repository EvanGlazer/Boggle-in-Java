/**
 *
 * @author Evan Glazer
 */
package core;
import java.util.ArrayList;
import java.util.Random;

public class Die 
{
    private final int NUMBER_OF_SIDES = 6;
    String currentLetter;
    
    // create the array for the letters
    private ArrayList<String> letters = new ArrayList<String>();
    
    public void randomLetter()
    {
        Random random = new Random();
        int value =  random.nextInt(NUMBER_OF_SIDES);

        currentLetter = letters.get(value);
    }
    
    public String getLetter()
    {
        randomLetter();
        return currentLetter;
    }

    public void addLetter(String letter)
    {
        letters.add(letter);
    }
    
    public void displayAllLetters()
    {     
        // create an instance of class String, locally called value
        // loop through the contents of container names letters
        for(String value : letters)
        {
            System.out.print(value + " ");
        }
    }
}
