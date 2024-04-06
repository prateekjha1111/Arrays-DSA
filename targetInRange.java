import java.util.Scanner;
public class targetInRange {
    public static int findIndex(int[] arr, int start, int end, int key){

        for(int i = start; i <= end; i++){
            if (arr[i] == key) {
                return i;
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
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter lowerIdx, upperIdx & target: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int key = sc.nextInt();
        int index = findIndex(arr, start, end, key);

        if (index != -1) {
            System.out.print("Target found at "+index);
        }
        else {
            System.out.print("Target not found!");
        }
        sc.close();
    }
}
