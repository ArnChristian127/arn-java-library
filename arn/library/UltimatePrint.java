//-- Ultimate Print --
//implemented by Arn Christian S. Rosales
//10-12-2024

//creating an enum to having a unique function in parameter
package arn.library;
enum Activate {
    NewLine,
    Loop,
    Array
}
//main class
public class UltimatePrint<T> {
    //make it the main class as an object rather than using Activate
    public static Activate NewLine = Activate.NewLine;
    public static Activate Loop = Activate.Loop;
    public static Activate Array = Activate.Array;

    //-- Function List --
    //insert (none): no return value and end up with new line
    //insert (output): returns the output of the data type
    //insert (output, newline): returns the output of the data type and activate the new line
    //insert (output, loop, count): returns the output of the datatype, activate the loop
    //and set a count to activate the second parameter
    //insertPrint (output, array): returns the output of an Array data type and activate the Array

    //using an overload method to have multiple parameter in one function
    public void insert() {
        System.out.println();
    }
    public void insert(T output) {
        System.out.print(output);
    }
    //the purpose of this one is to keep maintain the error if you put the keyset in first parameter
    public void insert(Activate keyset) {
        try {
            if (
                (keyset == Activate.NewLine) ||
                (keyset == Activate.Loop) ||
                (keyset == Activate.Array)
            ) {
                throw new Exception("[Arn-Library Error]: Parameter 1 cannot use this function");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void insert(T output, Activate keyset) {
        try {
            String loopError = "[Arn-Library Error]: Parameter 2 must have parameter 3 to activate this function.";
            String arrayError = "[Arn-Library Error]: Parameter 2 you must declare an Array datatype.";
            if (keyset == Activate.NewLine) {
                System.out.println(output);
            } else if (keyset == Activate.Loop) {
                throw new Exception(loopError);
            } else if (keyset == Activate.Array) {
                throw new Exception(arrayError);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void insert(T output, Activate keyset, int count) {
        try {
            String arrayError = "[Arn-Library Error]: Parameter 2 you must declare an Array datatype.";
            String newLineError = "[Arn-Library Error]: Parameter 2 cannot use this function when enabling a Loop.";
            if (keyset == Activate.Loop) {
                for (int i = 0; i < count; i++) {
                    System.out.println(output);
                }
            } else if (keyset == Activate.Array) {
                throw new Exception(arrayError);
            } else if (keyset == Activate.NewLine) {
                throw new Exception(newLineError);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void insert(Activate keyset, T...output) {
        String newLineError = "[Arn-Library Error]: Parameter 2 cannot use this function when enabling a Array.";
        String loopError = "[Arn-Library Error]: Parameter 2 cannot use this when its already iterated";
        try {
            if (keyset == Activate.Array) {
                for (int i = 0; i < output.length; i++) {
                    System.out.print(output[i] + " ");
                }
                System.out.println();
            } else if (keyset == Activate.Array) {
                throw new Exception(newLineError);
            } else if (keyset == Activate.NewLine) {
                throw new Exception(loopError);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
