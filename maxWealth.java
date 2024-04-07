import java.util.Scanner;
public class maxWealth {
    public static int findMaxWealth (int[][] arr){
        int wealth = Integer.MIN_VALUE;
        int custId = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            if(sum >= wealth){
                wealth = sum;
                custId = i;
            }
        }
        System.out.print("Customer "+(custId+1));
        return wealth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & columns of matrix: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr =new int[row][col];
        System.out.print("Enter elements: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // print array
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        int maximWealth = findMaxWealth(arr);
        System.out.print(" has maximum wealth of "+maximWealth);
        sc.close();
    }
}
