//-- Ultimate Scanner --
//implemented by Arn Christian S. Rosales
//10-13-2024

package arn.library;
//import the core
import java.util.Scanner;
//creating an enum to having a unique function in parameter
enum Set {
    Integer, 
    String, 
    Double,
    IsNone,
    IsNewLine,
    IsStayLine,
}
//main class
public class UltimateScanner {
    //make it the main class as an object rather than using Activate
    public final static Set Integer = Set.Integer;
    public final static Set String = Set.String;
    public final static Set Double = Set.Double;
    public final static Set IsNone = Set.IsNone;
    public final static Set IsNewLine = Set.IsNewLine;
    public final static Set IsStayLine = Set.IsStayLine;

    //global variable
    private int getTheInteger;
    private String getTheString;
    private Double getTheDouble;

    //-- Function list --
    //insert (keyset): return the Set value if it is integer, double, string
    //insert(keyset, funset, output): the Set value if it is integer, double, string
    //and return if the second parameter need to stay or create new line for third parameter (printing the output)

    //using an overload method to have multiple parameter in one function
    public void insert(Set keyset) {
        Scanner scan = new Scanner(System.in);
        if (keyset == Set.Integer) {
            getTheInteger = scan.nextInt();
        } else if (keyset == Set.String) {
            getTheString = scan.nextLine();
        } else if (keyset == Set.Double) {
           getTheDouble = scan.nextDouble();
        }
    }
    public void insert(Set keyset, Set funset, String output) {
        if (funset == Set.IsNone) {
            System.out.println();
        } else if (funset == Set.IsNewLine) {
            System.out.println(output);
        } else if (funset == Set.IsStayLine) {
            System.out.print(output);
        }
        insert(keyset);
    }

    //get the value from inputs
    public int getInteger() {
        return getTheInteger;
    }
    public String getString() {
        return getTheString;
    }
    public Double getDouble() {
        return getTheDouble;
    }
}