package Max;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Maxvalue
 */
public class Maxvalue {
    public void maxVal(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        Maxvalue obj = new Maxvalue();
        System.out.println("Enter the size of the array");
        int n = Integer.parseInt(in.readLine());
        System.out.println("Enter elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.readLine());
        }
        System.out.println("Largest element in the array is");
        obj.maxVal(arr);
    }
}