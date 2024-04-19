import java.util.Scanner;
import java.util.Arrays;
public class firstAndLastIndex {
    public static int[] findFirstAndLastOccurrence(int[] arr, int target){
       int first = findFirstOccurrence(arr, target);
       int last = findLastOccurrence(arr, target);

       if(first < last) return new int[]{first, last};
       return new int[]{-1, -1};
    }

    public static int findFirstOccurrence(int[] arr, int target){
        int ans = -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                ans = mid;
                end = mid - 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static int findLastOccurrence(int[] arr, int target){
        int ans = -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                ans = mid;
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter sorted (increasing format) elements, duplicates are allowed: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is "+(Arrays.toString(arr)));
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        System.out.print("Answer is "+(Arrays.toString(findFirstAndLastOccurrence(arr, target))));
        sc.close();
    }
}
