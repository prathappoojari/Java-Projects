package Max;

import java.io.DataInputStream;
import java.io.IOException;

public class SecondLargest {
    // arr = [20,12,35,28,34]
    public void secondMax(int[] arr) {
        int Largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {
                secondLarge = Largest;
                Largest = arr[i];
            } else if (arr[i] > secondLarge && arr[i] < Largest) {
                secondLarge = arr[i];
            }
        }
        if (secondLarge == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println(secondLarge);
        }
    }

    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        SecondLargest obj = new SecondLargest();
        System.out.println("Enter the size of the array");
        int n = Integer.parseInt(in.readLine());
        System.out.println("Enter elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.readLine());
        }
        System.out.println("Largest element in the array is");
        obj.secondMax(arr);
    }
}
