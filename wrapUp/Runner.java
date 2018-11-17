package wrapUp;


/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String str = in.nextLine();
        TextFormatter formatter = new TextFormatter(str);
        System.out.println(formatter.convertMarkup("_", "i"));
    }
}
