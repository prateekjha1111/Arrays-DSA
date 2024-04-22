import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void doSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            doSwap(arr, maxIndex, lastIndex);
        }
        System.out.print("Sorted array: " + Arrays.toString(arr));
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void doSwap(int[] arr, int maxIndex, int lastIndex) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is " + Arrays.toString(arr));
        doSelectionSort(arr);
        sc.close();
    }
}
