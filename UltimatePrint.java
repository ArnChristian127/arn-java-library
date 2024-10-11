package arn.library;
//ultimate print
//implemented by Arn Chrisian S. Rosales
//October 11-2024

//creating enum to create a unique constant variable function
enum Define {
    NewLine, Iter,
    Array, TwoDimensionArray
}
public class UltimatePrint<T> {

    //creating constant variable
    public static final Define NEW_LINE = Define.NewLine;
    public static final Define SET_ITER = Define.Iter;
    public static final Define SET_ARRAY = Define.Array;
    public static final Define SET_TWO_DIMENSIONAL_ARRAY = Define.TwoDimensionArray;

    //new line without parameter
    public void Output() {
        System.out.println();
    }

    //display the output in parameter 1
    public void Output(T output) {
        System.out.print(output);
    }

    //define the specific key in second paramter, if not define the main key
    //it shows the other option that will lead to a not actual error
    public void Output(T output, Define key) {
        switch (key) {
            //check if it define the new line
            case NewLine:
                System.out.println(output);
                break;
            //otherwise
            case Iter:
                System.out.println("[ArnLibrary Error]: Parameter 2 is missing the components for parameter 3 should write int value");
                break;
            case Array:
                System.out.println("[ArnLibrary Error]: Parameter 1 should be '[]' array");
                break;
            case TwoDimensionArray:
                System.out.println("[ArnLibrary Error]: Parameter 1 should be '[][]' two dimensional array");
                break;
            default:
                break;
        }
    }

    //if loop was define, should include the 3rd parameter
    //enter any number as you wish in count
    public void Output(T output, Define key, int count) {
        if (key == Define.Iter) {
            int i = 0;
            do {
                System.out.println(output);
                i++;
            }
            while(i < count);
        }
    }

    public void Output(T[] output, Define key) {
        switch (key) {
            //check if it define array
            case Array:
                for (int i = 0; i < output.length; i++) {
                    System.out.print(output[i] + " ");
                }
                System.out.println();
                break;
            //otherwise
            case NewLine:
                System.out.println("[ArnLibrary Error]: Unable to use this");
                break;
            case Iter:
                System.out.println("[ArnLibrary Error]: Unable to use loop");
                break;
            case TwoDimensionArray:
                System.out.println("[ArnLibrary Error]: Parameter 1 should be '[][]' to perform two dimensional array");
                break;
            default:
                break;
        }
    }
    
    public void Output(T[][] output, Define key) {
        switch (key) {
            //check if it define the two dimensional array
            case TwoDimensionArray:
            for (int i = 0; i < output.length; i++) {
                for (int j = 0; j < output[i].length; j++) {
                    System.out.print(output[i][j] + " ");
                }
                System.out.println();
            }
            //otherwise
            case NewLine:
                System.out.println("[ArnLibrary Error]: Unable to use this");
                break;
            case Iter:
                System.out.println("[ArnLibrary Error]: Unable to use loop");
                break;
            case Array:
                System.out.println("[ArnLibrary Error]: Parameter 1 should be '[]' to perform array");
                break;
            default:
                break;
        }
    }
}
