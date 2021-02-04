public class ArrayExplaned{

    public static void main(String[] args){
        int N =10;
        double[] a;
        a = new double[N];

        //anfang der While-schleife
        int i = 0;
        while(i < N){
            a[i] = 0.0;
            System.out.println("i=" + i);
            System.out.println("a[" + i + "]=>" + a[i]);
            System.out.println();

            i++;
        }
        //ende der While-schleife
    }
}
