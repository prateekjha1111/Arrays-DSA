import java.util.Scanner;
public class orderAgnosticBS {
    public static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            // ascending order
            else if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                }
                else end = mid - 1;
            }
            // descending order
            else {
                if(arr[mid] < target){
                    end = mid - 1;
                }
                else start = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int index = binarySearch(arr, target);

        if(index != -1) System.out.print("Target found at "+index);
        else System.out.print("Target not found!");
        sc.close();
    }
}
