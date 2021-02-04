import java.util.Scanner;

public class RemoveDuplicates{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.print(count + " ");

        while (scanner.hasNextInt() == true){
            int temp = scanner.nextInt();

            if (count != temp){
                System.out.print(temp + " ");
            }

            count = temp;
        }
        System.out.println();
    }
}
