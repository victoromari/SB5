import java.util.Objects;

/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class SkillBuilder5
{
    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        //TODO: replace this line with your code
        double sum = 0;
        double[] newArray = new double[data.length];
        int counter = 0;
        for (double datum : data){
            sum += datum;
            double doubVal = sum / (counter + 1);
            newArray[counter] = doubVal;
            counter++;
        }
        return newArray;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        //TODO: replace this line with your code.
        for(int i = 0; i < anArray.length; i++){
            if(anArray[i] == searchValue) return i;
        }
        return -1;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String s, String[] anArray)
    {
        //TODO: replace this line with your code.
        for(int c = 0;c < anArray.length;c++) if (Objects.equals(anArray[c], s)) return c;
        return -1;

    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray)
    {
        // add your code here
        int t = 0;
        int r = 0;
        for (String x : anArray) if(x != s) t++;
        String[] newArr =  new String[t];
        for(String x : anArray){
            if(!Objects.equals(x, s)){
                newArr[r] = x;
                r++;
            }
        }
        return newArr;
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray)
    {
        // add your code here
        int[] newArray = new int[anArray.length];
        for ( int b = 0;b < anArray.length;b++) {
            newArray[b] = anArray[b];
        }
        int track = 0;
        for (int r = anArray.length - 1; r >= 0;r--) {
            anArray[r] = newArray[track];
            track++;
        }
    }
}
