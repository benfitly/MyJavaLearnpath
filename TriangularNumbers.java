/*
    Write a program TriangularNumbers that takes exactly one argument and
    outputs the first triangular numbers in a line separated by spaces.
    If exactly one argument is not given, an error message is to be output.
*/

public class TriangularNumbers{

    public static void main (String[] args){
        int triang = 0;

        if (args.length != 1){
            System.out.println("ERROR: Bitte genau ein Argument angeben");

        }else{
            int n = Integer.parseInt(args[0]);

            for (int i = 1; i <= n; i++){
                triang += i;
                System.out.print(triang + " ");
            }
        }
        System.out.println();
    }

}
