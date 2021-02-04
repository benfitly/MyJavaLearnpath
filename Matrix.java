public class Matrix{

    public static void main(String[] args){

        if (args.length == 0){
            System.out.println("ERROR: please enter at least two arguments as the size of the matrix!");

        } else {
            int rows = Integer.parseInt(args[0]);
            int columns = Integer.parseInt(args[1]);
            int matSize = rows * columns;

            if (rows < 0 || columns < 0){
                System.out.println("ERROR: arguments for the size of the matrix must be positive integers!");

            } else if (args.length-2 != matSize){
                System.out.println("ERROR: The number of given values does not match the given size!");

            } else {
                int[][] matrix = new int[rows][columns];
                int sum = 0;
                int i = 0;
                int j = 0;
                int tmp = 0;

                for (i = 0; i < rows; i++){
                    for (j=0; j < columns; j++){
                        matrix[i][j] = Integer.parseInt(args[columns * i + j + 2]);
                        sum += matrix[i][j];
                    }
                }

                System.out.println(sum);

                for (i = 0; i < rows; i++){
                    for (j=0; j < columns; j++){
                        System.out.print(matrix[i][j] + " ");
                    }

                    System.out.println();
                }
            }
        }
    }
}
