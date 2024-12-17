public class ElectricGuitar 
{
    String brand;
    int numOfPickups;
    boolean rockstarUsesIt;
    
    String getBrand()
    {
        return brand;
    }

    void setBrand(String aBrand)
    {
        brand = aBrand;
    }

    int getNumOfPickups()
    {
        return numOfPickups;
    }

    void setNumOfPickups(int num)
    {
        numOfPickups = num;
    }

    boolean getRockStarUsesIt()
    {
        return rockstarUsesIt;
    }

    void setRockstarUsesIt(boolean yesOrNo)
    {
        rockstarUsesIt = yesOrNo;
    }
}
