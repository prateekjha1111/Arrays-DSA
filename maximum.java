import java.util.Scanner;
public class maximum {
    public static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val >= max) {
                max = val;
            }
        }
        return max;
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
        System.out.print("Maximum value is "+findMaxValue(arr));
        sc.close();
    }
}
