import java.util.Arrays;
import java.util.Scanner;
public class pivot {
    public static int findPivot (int[] arr){
        int ans = -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[arr.length - 1]) {
                start = mid + 1;
            }
            else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
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
        System.out.print("Index of the minimum element or pivot is "+findPivot(arr));
        sc.close();
    }
}
