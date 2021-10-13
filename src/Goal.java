/**
 * A "Goal" is a single row of spaces that the players are attempting to fill in, from left to right.
 */
public class Goal
{
    // I suggest that you have variables to keep track of which number goal this is, what the reward is, a list of dice
    //   numbers to match, and a list of booleans indicating whether there are dice on them.
    // As with Crazy 8s, a method to decide whether a given die is legal to add to this row would be handy, as would be
    //   method that actually does so...

    // this might be handy:
    private final String[] spaceNames = {"a","b","c","d","e","f"}; // even if you don't use all of them.

    // ---------------------------------
    // TODO: decide what private member variables you wish to have. (See suggestion above.)

    // ---------------------------------

    public Goal(int rowNum, int reward, int[] numsToMatch)
    {
        // ---------------------------------
        // TODO: you write this.

        // ---------------------------------
    }


    public String toString()
    {
        String result = "";
        // ---------------------------------
        // TODO: you write this.

        // ---------------------------------
        return result;
    }



}
