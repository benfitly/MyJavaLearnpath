public class MagicIt{

    public static int magici(int m){
        if (m <= 0) return 1;

        int calc = 1;

        for (int i=1; i<=m; i++){
            calc *= i;
        }
        return calc;
    }

    public static void main(String[] args){
        System.out.println(magici(5));
    }
}
