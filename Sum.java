/*
    Write a program named Sum that takes any number of integers as arguments
    and calculates their sum.
    The program should then output the calculated sum on the console.
*/

public class Sum{

    public static void main (String[] args){

        int[] arr = new int[args.length];

        if (arr.length == 0){
            System.out.println ("0");

        }else{
            int sum = 0;

            for (int i=0; i<arr.length; i++){
                int add = Integer.parseInt(args[i]);
                sum +=add;
            }

            System.out.println(sum);
        }
    }
}
