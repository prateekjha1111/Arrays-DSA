import java.util.Arrays;
import java.util.Scanner;
public class searchInRotated {
    public static int findTarget(int[] arr, int target){
        int ans = -1;
        int pivot = findPivot(arr);
        if (target > arr[arr.length - 1]) {
            ans = binarySearch(arr, target, 0, pivot - 1);
        }
        else ans = binarySearch(arr, target, pivot, arr.length - 1);
        return ans;
    }
    public static int findPivot (int[] arr){
        int pivot = -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[arr.length - 1]) {
                start = mid + 1;
            }
            else {
                pivot = mid;
                end = mid - 1;
            }
        }
        return pivot;
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in rotated sorted manner: for example 3, 4, 5, 1, 2");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is "+Arrays.toString(arr));
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        System.out.print("Index of the target is "+findTarget(arr, target));
        sc.close();
    }
}
