import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class without_bubbleSort {
    public static void main(String[] args) {
        Scanner sc = newScanner(System.in);
        int n, i;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static Scanner newScanner(InputStream in) {
        return null;
    }
}