class MultiplierObject
{
    int value;

    public int calculateValue(int factor)
    {
        if(value > 100)    // If value is greater than 100, multiply by factor; else multiply by (5-factor)
        {
            return value * factor;
        }
        else
        {
            return value * (5 - factor);
        }
    }
}

public class Puzzle4 
{
    public static void main(String[] args) 
    {

        MultiplierObject[] multiplierObjects = new MultiplierObject[6];    // Creates an array to hold 6 multiplier objects
        int multiplier = 1;
        int arrayIndex = 0;
        int totalSum = 0;
        
        
        while(arrayIndex < 6)    // Initialise array with MultiplierObject instances
        {
            multiplierObjects[arrayIndex] = new MultiplierObject();
            multiplierObjects[arrayIndex].value = multiplier;
            multiplier = multiplier * 10;
            arrayIndex = arrayIndex + 1;
        }    
        arrayIndex = 6;

        while(arrayIndex > 0)    // Calculate the sum by calling calculateValue() on each object
        {
            arrayIndex = arrayIndex - 1;
            totalSum = totalSum + multiplierObjects[arrayIndex].calculateValue(arrayIndex);
        }
        System.out.println("Total sum: " + totalSum);
    }    
}

