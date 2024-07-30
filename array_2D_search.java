import java.util.Scanner;

public class array_2D_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("enter the number of columns : ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        // input

        System.out.println("enter the elements in 2D array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter a number which want to search in array : ");

        int x = sc.nextInt();
        // output

        System.out.println("your output of given array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println(x+" found at location (" + i+","+j+")");
                
                    
                }
        }
        
    }
}
}
