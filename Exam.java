import java.util.Scanner;

public class Exam{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int overallNote = Integer.parseInt(args[0]);
        int requirement = overallNote/2;
        int note = 0;
        String result = "";

        String uniID, add;

        while (scanner.hasNext() == true){
            uniID = scanner.next();
            note = scanner.nextInt();

            if (note < requirement){
                add = ",No\n";

            } else {
                add = ",Yes\n";

            }
            result += uniID + add;
        }

        System.out.println("Student,Admission");
        System.out.print(result);
    }
}
