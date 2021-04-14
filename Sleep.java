public class Sleep {
    public static void main(String[] args) {
        System.out.println("Starting Sleep...");
        
        OneSecondSleeper sleeper0 = new OneSecondSleeper(0);
        OneSecondSleeper sleeper1 = new OneSecondSleeper(1);
        
        System.out.println("\nSleep");
        long start = System.currentTimeMillis();
        sleeper0.sleep();
        sleeper1.sleep();
        System.out.println("Elapsed time = " + (System.currentTimeMillis() - start) + "\n");
    }
}
