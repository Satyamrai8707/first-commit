import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("enter the elements in array : ");
        for(int i = 0;i<size;i++){
            numbers[i] = sc.nextInt();

        }
        
        System.out.println("Your outcome of arrays elements : ");
        for(int j=0; j<size;j++){
            System.out.println(numbers[j]);
        }
    }
    
}
