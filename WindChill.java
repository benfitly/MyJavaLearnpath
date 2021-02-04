/*
    Write a program WindChill that takes the temperature t and
    the wind speed v as parameters and outputs the wind chill w.
    NOTE: w(t,v)=35.74 + 0.6215t+ (0.4275t - 35.75) v ^ 0.16 
*/
public class WindChill {

    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double vv = Double.parseDouble(args[1]);
        double v = Math.pow(vv,0.16);

        double w = 35.74 + 0.6215*t+((0.4275*t)- 35.75)*v;
	    System.out.println(w);
    }
}
