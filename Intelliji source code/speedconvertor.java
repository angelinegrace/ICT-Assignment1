public class speedconvertor {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(10.25));
    }

    public static long toMilesPerHour(double kilometeresperhour) {
        if (kilometeresperhour < 0) {
            return -1;
        }
        return Math.round(kilometeresperhour / 1.609);
    }
}
