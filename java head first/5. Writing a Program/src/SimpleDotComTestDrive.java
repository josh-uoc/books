public class SimpleDotComTestDrive
{
    public static void main(String[] args)
    {
        SimpleDotCom dot = new SimpleDotCom();
        // DECLARE an *int array* to hold the location of the cells. Call it  "locationCells"
        int[] locations = {2, 3, 4};
        // DECLARE an *int* to hold the number of hits. Call it "numOfHits" and SET it to 0

        // DECLARE a "checkYourself()"" *method* that takes a *String* for the user's guess, checks it, and returns result
        // DECLARE a "setLocationCells()" setter *method* that takes an *int array* which has 3 cell locations as *int*
        dot.setLocationCells(locations);

        // METHOD: "String checkYourself(String userGuess)"
            // GET the user guess as a String parameter
            // CONVERT the user guess to an *int*
            // REPEAT with each of the location cells in the *int* array
                // COMPARE the user guess to the location cell
                // IF the user guess matches
                    // INCREMENT the number of hits
                    //  FIND OUT if it was the last location cell
                    // IF number of hits is 3, RETURN "kill"
                    // ELSE, RETURN "hit"
                    // END IF
                // ELSE the user guess did not match, so RETURN "miss"
                // END IF
            // END REPEAT
        // END METHOD

        // METHOD: void setLocationCells(int[] cellLocations)
            // GET the cell locations as in *int array* parameter
            // ASSIGN the cell locations parameter to the cell locations instance variable
        // END METHOD 
    }
}
