public class MagicRec{

    public static int magic(int n){
        if (n <= 0) return 1;
        return magic(n-1)*n;
    }

    public static void main(String[] args){
        System.out.println(magic(5));
    }
}
