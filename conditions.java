import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* int btn = sc.nextInt();*/
        /*if (btn == 1) {
            System.out.println("Hello");} 
            
        else if (btn == 2) {
            System.out.println("Namaste");}
        else if (btn == 3) {
            System.out.println(" Banjour");
        }
        else {
            System.out.println("Invalid button");
        }  */

        /*switch (btn) {
            case 1:  System.out.println("Hello");
            break;
            case 2:  System.out.println("Namaste");
            break;
            case 3:  System.out.println("Banjour");
            break;
                     
        
            default: System.out.println("Invalid btn");
            break;
        } */
       System.out.println("************************ Calculator *******************");
       System.out.println("Enter your 1st digit :");
       float num1 = sc.nextInt();
       System.out.println("Enter your 1st digit :");
       float num2 = sc.nextInt();
       System.out.println("Choose any one operation (+,-,*,/,%)");
       String operation = sc.next();
       switch (operation) {
        case "+": 
        float sum = num1+num2;
        System.out.println("Sum is : "+sum);
        break;
        case "-": 
        float sub = num1-num2;
        System.out.println("Subtract is : "+sub);
        break;
        case "*": 
        float mult = num1*num2;
        System.out.println("Multiplication is : "+mult);
        break;
        case "/": 
        float div = num1/num2;
        System.out.println("Division is : "+div);
        break;
        case "%": 
        float exp = num1%num2;
        System.out.println("Remainder is : "+exp);
        break;
       
        default:
        System.out.println("Invalid operation");
        break;
       }




    }
}
