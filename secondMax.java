import java.util.Scanner;
public class secondMax {
    public static int findSecondMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                secMax = max;
                max = val;
            } else if (val > secMax && val != max) {
                secMax = val;
            }
        }
        return secMax;
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
        System.out.print("Second maximum value is "+findSecondMaxValue(arr));
        sc.close();
    }
}
