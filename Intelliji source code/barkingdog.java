public class barkingdog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 2));
    }

    public static boolean shouldWakeUp(boolean barking, int hourofDay) {
        if (hourofDay < 0 || hourofDay > 23) {
            return false;
        } else {
            return (barking) && (hourofDay >= 0 && hourofDay < 8) || (hourofDay > 22) && (hourofDay <= 23);
        }

    }
}
