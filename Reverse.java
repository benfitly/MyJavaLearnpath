/*
   Write a program named Reverse that takes an arbitrary number of arguments 
   and outputs them line by line in reverse order.
   If no argument is passed, nothing is to be output.
*/

public class Reverse{

    public static void main(String[] args){
        int[] arr = new int[args.length];

        if (args.length == 0) System.out.println("");

        for (int j = arr.length-1; j >= 0; j-- ){
            for (int i = 0; i < args.length; i++){
                arr[i] = Integer.parseInt(args[i]);
            }

            System.out.print(arr[j]+ " ");
        }

        System.out.println();
    }
}
