package school.lemon.changerequest.java.introduction.hw1;


public class Task5 {
    public static double calculateA(double x, double y, double z) {
        return
                2 * (Math.sin(x - (Math.PI) / 6)) * calculateB(z) / (0.5 + (Math.pow(Math.sin(y), 2)));
    }

    private static double calculateB(double z) {
        double zkv = Math.pow(z, 2);
        return 1 + zkv / (3 + zkv / 5); // Test 5 done.
    }
}
