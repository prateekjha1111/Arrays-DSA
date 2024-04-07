import java.util.Scanner;
import java.util.Arrays;
public class targetIn2D {
    public static int[] findMaxValIndex(int[][] arr, int key){
    
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == key){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows & columns of the matrix: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements");

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter the target: ");
        int key = sc.nextInt();
        int[] ans = findMaxValIndex(arr, key);
        if(ans != null) System.out.print("Target found at "+Arrays.toString(ans));
        else System.out.print("Target not found!");
        
        sc.close();
    }
}
