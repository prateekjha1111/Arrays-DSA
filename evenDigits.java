import java.util.Scanner;
public class evenDigits {
    public static int findEvenDigitsInArray (int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int digits = (int)(Math.log10(arr[i])) + 1;
            if(digits % 2 == 0) count++;
        }

        return count;
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

        System.out.print("Number of elements having even number of digits is "+findEvenDigitsInArray(arr));
        sc.close();
    }
}
