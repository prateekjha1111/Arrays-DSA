import java.util.Scanner;

public class targetSearchInString {
    public static void returnIndexOfTarget(String str, char key) {
        if (str.isEmpty()) {
            System.out.println("Error: Empty string provided.");
            return;
        }
        
        char[] arr = str.toCharArray();
        boolean found = false; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("The target character '" + key + "' was not found in the string.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().trim();
        System.out.print("Enter a target (character): ");
        char key = sc.next().charAt(0);
        returnIndexOfTarget(str, key);
        sc.close(); 
    }
}
