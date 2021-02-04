/* Write a program Chess, which gets a positive integer n as argument
from the console and outputs a chessboard of size n×n.

Black squares are represented by an asterisk,
white squares by a space. The board starts at the top left with a black square.

If no argument is given or the number entered is negative,
the program shall print an error message. */

public class Chess{

    public static void main(String[] args){

        if (args.length == 0){
            System.out.println("ERROR : Please enter the size of the field as argument!");

        }else{

            int n = Integer.parseInt(args[0]);

            if (n < 0){
                System.out.println("ERROR : Please enter the size of the field as positiv number as argument!");

            }else{

                int[][] arr = new int[n][n];

                for(int i = 0; i < n; i++){
                    for(int j = 0; j < arr[i].length; j++){
                        if (i % 2 == j % 2 ){
                            System.out.print("*");

                        }else if(i % 2 != j % 2){
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
