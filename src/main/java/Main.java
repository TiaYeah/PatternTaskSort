import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];

        ArrayInitializer.initialize(arr);

        System.out.println(Arrays.toString(arr));

        ASorter sorter = new Mod2Decorator(new IncreasingSorter());

        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
