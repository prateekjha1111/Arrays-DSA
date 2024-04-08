import java.util.Scanner;
public class ascBinarySearch {
    public static int binarySearch(int[] arr, int target){
        // only for sorted arrays in asc order
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start)/2;
        while (start <= end) {
            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
       return -1; // not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.print("Target found at index " + index);
        } else {
            System.out.print("Target not found!");
        }
        sc.close();
    }
}
