import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        // Declaration
        // type[][]arrayName = new type[rows][columns];
        // int[][]numbers = new int[3][5];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("enter the number of columns : ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
          //input

        System.out.println("enter the elements in 2D array : ");  
        for(int i = 0;i<rows;i++){
            for(int j = 0;j< cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }  
        // output
        System.out.println("your output of given array : ");
        for(int i = 0; i<rows;i++){
            for(int j = 0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }

    
}
