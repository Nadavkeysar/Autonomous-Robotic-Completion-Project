package Bereshit;

public class Moon {
    // from: https://he.wikipedia.org/wiki/%D7%94%D7%99%D7%A8%D7%97
    public static final double RADIUS = 3475*1000; // meters
    public static final double MoonGravity = 1.622;// m/s^2
    public static final double EQ_SPEED = 1700;// m/s

    public static boolean inMoonRange(double altitude) {
        if (altitude < 17000) {
            return true;
        }
        return false;
    }

    public static double getAcc(double speed) {
        double n = Math.abs(speed)/EQ_SPEED;
        double ans = (1-n)* MoonGravity;
        return ans;
    }
}