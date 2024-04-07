import java.util.Scanner;
public class maxIn2D {
    public static int findMaxIn2D(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }

        return max;
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
        int max = findMaxIn2D(arr);
        if(max != Integer.MIN_VALUE) System.out.print("Maximum value is "+max);
        sc.close();
    }
}
