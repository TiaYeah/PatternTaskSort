import java.util.Random;

public class ArrayInitializer {

    public static void initialize(int[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
    }
}
