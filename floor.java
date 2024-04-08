import java.util.Scanner;
public class floor {
    public static int floorOfNumber (int[] arr, int target){
        if (target > arr[arr.length - 1] || target < arr[0]) {
            return -1;
        }

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
        }

         return end;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in increasing order: ");
        for (int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int floor = floorOfNumber(arr, target);

        if(floor != -1) System.out.print("Target found at index "+floor);
        else System.out.print("Floor does not exist!");
        sc.close();
    }
}
