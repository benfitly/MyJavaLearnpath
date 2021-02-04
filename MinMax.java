public class MinMax{

    public static void main(String[] args){
        int m = 0, n=1;
        int[] arr = new int[args.length];

        //If no argument is given, an error message should be issued
        if (args.length == 0) {
            System.out.println("ERROR, please give at least one number!! ");

        }else{
            //arr takes any number of integers as arguments from the console
            for(int i = 0; i < args.length; i++){
                arr[i] = Integer.parseInt(args[i]);
            }
            //Sort the array in ascending order using BubbleSort
            for(m = 0; m < arr.length; m++){
                for(n = m+1; n < arr.length; n++){
                    if(arr[m] > arr[n]){
                        int help = arr[m];
                        arr[m] = arr[n];
                        arr[n] = help;
                    }
                }
            }

            //print the minimum and the maximum of arr
            System.out.println("Min= " + arr[0]);
            System.out.println("Max= " + arr[arr.length-1]);
        }
    }
}
