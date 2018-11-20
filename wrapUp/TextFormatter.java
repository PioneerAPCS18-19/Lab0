package wrapUp;

/**
 * Write a description of class TextFormatter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TextFormatter
{
    private String line; //  The line to format

    public TextFormatter (String lineToFormat)
    {  
        line = lineToFormat;  
    }

    /**
     * Finds the first single instance of str in line,
     * starting at the position start
     * @param str the string of length 1 to find.
     * Guaranteed to be length 1.
     * @param start the position to start searching.
     * Guaranteed to be in the string line.
     * @return the index of the first single instance of
     * str if the string is found or -1 if it is not found.
     */
    public int findString (String str, int start)
    {  
        /* To be implemented in part a) */
        
        for(int i = start; i < line.length(); i++)
        {   
            if(line.substring(i, i+1).equals(str) && (i == 0 || !line.substring(i-1, i).equals(str)) && 
                    (i == line.length() - 1 || !line.substring(i+1, i+2).equals(str)))
            {
                return i;
            }
        }
        
        
        
        /* ALTERNATE SOLUTION
        while(psn > -1)
        {
            
            String before = "";
            String after = "";
            
            if(psn > 0)
            {
                before = line.substring(psn-1, psn);
            }
            
            if(psn < line.length() - 1)
            {
                after = line.substring(psn+1, psn+2);
            }
            
            if(!before.equals(str) && !after.equals(str))
            {
                return psn;
            }
            
            psn++;
            
            psn = line.indexOf(str, psn);
        }
         */
        
        
        
        return -1;
    }

    /**
     * Count the number of times single instances of str appear in
     * the line.
     * @param str the string to find.
     * Guaranteed to be length 1.
     * @return the number of times the string appears in the line
     */
    private int countStrings (String str)
    {  
        /* To be implemented in part b) */ 
        
        return -1;
    }

    /**
     * Replace all single instances of underscores in the line given by
     * line with italics tags.  There must be an even number of underscores
     * in the line, and they will be replaced by <i>, </i>, alternating.
     * @param original a string of length 1 to replace (ex: "_")
     * @param replacement the string (of any length) use as a replacement (Ex: "i")
     * @return the line with single instances of underscores replaced with
     * <i> tags or the original line if there are not an even number of
     * underscores.
     */
    public String convertMarkup (String rep, String elem)
    {  
        /* To be implemented in part c) */ 
        
        return "";
    }
}