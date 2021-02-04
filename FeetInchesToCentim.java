public class FeetInchesToCentim{

    // if both feet and inches numbers are give
    public static double calcFeetInchesToCentim(double feet, double inches){
        if (feet < 0 || inches < 0 || inches > 12){
            return -1;
        } else {
            feet += (inches / 12);
            double cm = feet / 0.032808;

            return cm;
        }
    }

    // if just inches number is given
    public static double calcFeetInchesToCentim(double inches){
        if (inches < 0){
            return -1;
        } else {
            double feet = (int) inches / 12;   // calcs how much feet in inches
            double restofInches = (int) inches % 12;  // calcs rest of inches

            return calcFeetInchesToCentim(feet, restofInches);
        }
    }

    public static void main(String[] args){

        System.out.println(calcFeetInchesToCentim(10,0) + " cm");

        System.out.println(calcFeetInchesToCentim(100) + " cm");

    }
}
